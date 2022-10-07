# TARSIER Project meta info

[简体中文](./README.md)

The meta info of Tarsier Project, including reports, slides, roadmaps.

## Content

```bash
tarsier-meta
    |-----roadmap                                # Strategy and roadmap
    |-----standard                               # Specification requirements, template documents, etc
    |-----manuals                                # Test description document, divided by software package
    |       |-----xfce                           # Test instructions, installation instructions, user instructions, test cases, etc. of the software package
    |       |-----firefox
    |       |-----chromium
    |       |-----<otherPackages>
    |
    |-----reports                                # Test report, classified by Linux distribution
    |       |-----openEuler                      # Test report, classified by software package
    |       |        |-----xfce
    |       |        |-----<otherPackages>
    |       |-----Debian
    |       |        |-----xfce
    |       |        |-----<otherPackages>
    |       |-----<Linux distros>
    |
    |-----evidence                               # Test intermediate data
    |       |-----Fedora
    |       |        |-----xxxxx.md
    |       |        |-----<otherMaterials>
    |       |-----<Linux distros>
    |
    |-----render.py                              # Yaml to Markdown Table Tool
```
