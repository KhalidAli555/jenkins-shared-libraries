def call(String url, String branch) {
    git url: url, branch: branch
    echo "clone code successfully"
}
