package defpackage;

import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.internal._HeadersCommonKt;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c98  reason: default package */
/* loaded from: classes3.dex */
public final class c98 implements lu4 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Request.Builder b;

    public c98(boolean z, Request.Builder builder) {
        this.a = z;
        this.b = builder;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        str.getClass();
        str2.getClass();
        if (!this.a || !str.equals("Content-Length")) {
            Headers.Builder builder = this.b.c;
            builder.getClass();
            _HeadersCommonKt.b(str);
            _HeadersCommonKt.c(str2, str);
            _HeadersCommonKt.a(builder, str, str2);
        }
        return pvc.a;
    }
}
