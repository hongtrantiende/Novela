package okhttp3.internal.http;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class RealResponseBody extends ResponseBody {
    public final String b;
    public final long c;
    public final mj9 d;

    public RealResponseBody(String str, long j, mj9 mj9Var) {
        this.b = str;
        this.c = j;
        this.d = mj9Var;
    }

    @Override // okhttp3.ResponseBody
    public final long o() {
        return this.c;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType q() {
        String str = this.b;
        if (str != null) {
            gm9 gm9Var = MediaType.b;
            try {
                return MediaType.Companion.a(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    public final bz0 v() {
        return this.d;
    }
}
