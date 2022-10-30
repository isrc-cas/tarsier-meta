# Test for LuaJIT

Project: [infiwang/LuaJIT](https://github.com/infiWang/LuaJIT/commit/)

riscv-stub: [c15778c]<https://github.com/infiWang/LuaJIT/commit/c15778c21c0432fab362551328443e8e5fdeb7e1>

riscv-dynasm: [a10d27e](https://github.com/infiWang/LuaJIT/commit/a10d27e9e7e0fd7496b577af29681f6de61f46d0)

## Build tricks

Use `riscv-stub` as base and merge `riscv-dynasm`.

modify files to bypass check:

```patch
diff --git a/src/host/buildvm.c b/src/host/buildvm.c
index 9ebfb8fe..721f76ad 100644
--- a/src/host/buildvm.c
+++ b/src/host/buildvm.c
@@ -41,7 +41,7 @@
 #define Dst		ctx
 #define Dst_DECL	BuildCtx *ctx
 #define Dst_REF		(ctx->D)
-#define DASM_CHECKS	1
+//#define DASM_CHECKS	1

 #include "../dynasm/dasm_proto.h"

diff --git a/src/lj_vmmath.c b/src/lj_vmmath.c
index b6cc60ba..a71cdfb3 100644
--- a/src/lj_vmmath.c
+++ b/src/lj_vmmath.c
@@ -58,7 +58,7 @@ double lj_vm_foldarith(double x, double y, int op)

 /* -- Helper functions for generated machine code ------------------------- */

-#if (LJ_HASJIT && !(LJ_TARGET_ARM || LJ_TARGET_ARM64 || LJ_TARGET_PPC)) || LJ_TARGET_MIPS
+#if (LJ_HASJIT && !(LJ_TARGET_ARM || LJ_TARGET_ARM64 || LJ_TARGET_PPC)) || LJ_TARGET_MIPS || LJ_TARGET_RISCV64
 int32_t LJ_FASTCALL lj_vm_modi(int32_t a, int32_t b)
 {
   uint32_t y, ua, ub;
```

`make`

## Hello World

```lua
print("Hello, sekai.")

```

```
Hello, sekai.
```

OK

## Test prime numbers

```lua
function is_prime(n)
    i = 2
    j = math.sqrt(n)
    while i <= j do
        if (n % i ) == 0 then return false end
        i = i + 1
    end
    return true
```

FAIL, see bug

## Bug

1. bug in `while` and `if` triggered when comparing an `int` and a `float` with `leq` or `geq`

   ```lua
   if 1<=1.5 then print("Ping") end
   ```

   ```
   Segment fault (core dumped)
   ```

1. `float` `eq` comparing problem

   ```lua
   print(1.5==1.5)
   ```

   ```
   false
   ```

1. bug in `while` and `if` triggered when comparing an `int` and a `float` with `leq`

   ```lua
   if 2<1.5 then print("Ping") end
   ```

   ```
   Segment fault (core dumped)
   ```

## Known broken

`for` is broken, program will stuck there.
