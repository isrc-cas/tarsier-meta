from distutils.dist import Distribution
import pandas
import yaml

Distribution = ["种类", "Debian", "Gentoo", "openSUSE", "Arch Linux", "FreeBSD","OpenBSD", "Alpine", "openKylin", "Fedora", "OpenEuler", "Anolis", "Deepin", "Ubuntu"]
with open("./evidence/observe.yaml", 'r', encoding='utf-8') as stream:
    try:
        parsed_yaml = yaml.safe_load(stream)
        #print(parsed_yaml)
    except yaml.YAMLError as exc:
        print(exc)

frames = []
keys = []
index = list(parsed_yaml)
print(parsed_yaml[index[0]])
for packageCategory in index:
    print(packageCategory)
    keys.append(packageCategory)
    df = pandas.DataFrame(columns=Distribution)
    for packageName in parsed_yaml[packageCategory].keys():
        df = df.append(pandas.DataFrame(parsed_yaml[packageCategory][packageName], index=[packageName])).fillna('N/A')
    df["种类"] = packageCategory
    print(df)
    frames.append(df)
result = pandas.concat(frames, names=['Series name', 'Row ID'])

with open('table.md', "w+", encoding='utf-8') as output:
    output.write(result.to_markdown())
