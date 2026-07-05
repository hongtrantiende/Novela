package defpackage;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ic2  reason: default package */
/* loaded from: classes3.dex */
public final class ic2 extends ResponseBody {
    public final ResponseBody b;
    public final Call c;
    public final /* synthetic */ jc2 d;

    public ic2(jc2 jc2Var, ResponseBody responseBody, Call call) {
        this.d = jc2Var;
        this.b = responseBody;
        this.c = call;
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
        this.d.b.remove(this.c);
    }

    @Override // okhttp3.ResponseBody
    public final long o() {
        return this.b.o();
    }

    @Override // okhttp3.ResponseBody
    public final MediaType q() {
        return this.b.q();
    }

    @Override // okhttp3.ResponseBody
    public final bz0 v() {
        return this.b.v();
    }
}
