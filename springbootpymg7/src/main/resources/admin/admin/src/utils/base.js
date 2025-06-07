const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootpymg7/",
            name: "springbootpymg7",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootpymg7/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "医院核酸检测预约挂号微信小程序"
        } 
    }
}
export default base
