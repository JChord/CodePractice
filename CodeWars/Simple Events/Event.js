function Event() {
    var pool = [];

    this.subscribe = function(f) {
        f.idx = pool.length;
        pool[pool.length] = f;
    };

    this.unsubscribe = function(f) {
        pool.splice(f.idx, 1);
    };

    this.emit = function() {
        pool.forEach(func=>{
            func.apply(this, arguments);
        });
    };
}
