A [github-template][github-template] for [outwatch](https://github.com/outwatch/outwatch).

Make sure that `java`, `sbt`, `nodejs`, `yarn` and `github-cli` (optionally) are installed.

```shell
# create new repo on github based on this template
gh repo create my-first-outwatch-project --template outwatch/example --public --clone

# if you want to just get the template locally without creating a github repo:
git clone --depth 1 https://github.com/outwatch/example my-first-outwatch-project


```

In your newly created project directory, run:

```shell
sbt dev
```

and point your browser to <http://localhost:12345>.

This example is also automatically deployed to github pages: <https://outwatch.github.io/example>

Template license
----------------
Written in 2016 by Luka Jacobowitz
[other author/contributor lines as appropriate]

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[github-template]: https://docs.github.com/en/repositories/creating-and-managing-repositories/creating-a-template-repository
