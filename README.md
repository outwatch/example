A [github-template][github-template] for [outwatch](https://github.com/outwatch/outwatch).

Make sure that `java`, `sbt`, `nodejs`, `yarn` and `github-cli` (optionally) are installed.

```bash
# create new repo on github based on this template
gh repo create my-first-outwatch-project --template FloWi/outwatch-template --public --clone

# if you want to just get the template locally without creating a github repo:
git clone --depth 1 https://github.com/FloWi/outwatch-template my-first-outwatch-project


```

In your newly created project directory, run:

```bash
sbt dev
```

and point your browser to http://localhost:12345.

**TODO: here**
This example is also automatically deployed to github pages: <https://outwatch.github.io/outwatch-template>

Template license
----------------
Written in 2016 by Luka Jacobowitz
[other author/contributor lines as appropriate]

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[github-template]: https://docs.github.com/en/repositories/creating-and-managing-repositories/creating-a-template-repository
