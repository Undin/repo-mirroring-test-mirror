# repo-mirroring-test

Experiment with mirroring a private development repository to a public one.

- `repo-mirroring-test-main` - source repository where development happens
- `repo-mirroring-test-mirror` - mirror, updated by `.github/workflows/mirror.yml` on every push to `main` and on tags

The mirror is pushed with a GitHub App token since deploy keys can't push changes in `.github/workflows`.
