package migdb.dsl.ops.typing

class TypeResult {
	public Context context
	public String msg
	
	new(Context ctx) {
		this.context = ctx
		this.msg = null
	}
	
//	new(Context context, String result) {
//		this.context = context
//		this.result = result
//	}
	
	new(Context ctx, CharSequence res) {
		this.context = ctx
		this.msg = res.toString
	}
}