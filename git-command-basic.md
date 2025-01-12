# Git Basic Command

- Set your username:
```git
        git config --global user.name "FIRST_NAME LAST_NAME"
```

- Set your email address:
```git 
        git config --global user.email "MY_NAME@example.com"
```

## Basic command section 1

```
    git --version
```

```
    git status
```

```
    git config --list
```

```
    git init
```

```
    git add fileName/.
```
### unstage file

```
    git rm --cached fileName/.
```

```
    git commit -m "First commit"
```

### Delete Local branch
```
        git branch -D <branch_name>

```

### Delete Remove Branch

```
        git push -d <remote_name> <branchname>
        eg: git push -d origin test
```
