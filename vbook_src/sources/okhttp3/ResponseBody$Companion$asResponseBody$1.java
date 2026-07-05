package okhttp3;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class ResponseBody$Companion$asResponseBody$1 extends ResponseBody {
    public final /* synthetic */ MediaType b;
    public final /* synthetic */ long c;
    public final /* synthetic */ bz0 d;

    public ResponseBody$Companion$asResponseBody$1(MediaType mediaType, long j, bz0 bz0Var) {
        this.b = mediaType;
        this.c = j;
        this.d = bz0Var;
    }

    @Override // okhttp3.ResponseBody
    public final long o() {
        return this.c;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType q() {
        return this.b;
    }

    @Override // okhttp3.ResponseBody
    public final bz0 v() {
        return this.d;
    }
}
