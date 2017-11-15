function smaller(nums) {
    return nums.map((item, idx, array)=>{
        return array.slice(idx+1).reduce((sum, ele)=>{
            if (ele < item) {
                return ++sum;
            } else{
                return sum;
            }
        },0);
    });
}
