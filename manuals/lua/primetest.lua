function is_prime(x)
    if (x == 1 or x % 2 == 0 and x ~= 2) then
        return false
    else
        for i = 3, math.sqrt(x), 2 do
            if (x % i == 0) then
                return false
            end
        end
        return true
    end
end

for j = 1, 200 do
    if is_prime(j) then
        io.write(j .. " ")
    end
end
io.write("\n")