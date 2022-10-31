from distutils.dist import Distribution
import pandas
import yaml

Distribution = ["开发板名称","QEMU","全志哪吒 D1","赛昉 VisionFive","HiFive Unleashed","HiFive Unmatched","PolarFire SoC Icicle Kit"]
with open("../table/hardware.yaml", 'r', encoding='utf-8') as stream:
    try:
        parsed_yaml = yaml.safe_load(stream)
        #print(parsed_yaml)
    except yaml.YAMLError as exc:
        print(exc)

frames = []
keys = []
index = list(parsed_yaml)
print(parsed_yaml[index[0]])
for dist in index:
    print(dist)
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
