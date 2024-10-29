const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm2236x/",
            name: "ssm2236x",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm2236x/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "医学生在线学习交流平台"
        } 
    }
}
export default base
