package defpackage;

import com.google.android.recaptcha.internal.zzce;
import com.google.android.recaptcha.internal.zznm;
import com.google.android.recaptcha.internal.zznn;
import java.io.IOException;
import java.security.GeneralSecurityException;
import okhttp3.EventListener;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hfd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hfd implements u94, EventListener.Factory {
    public static /* synthetic */ void c() {
        throw new g1e();
    }

    public static /* synthetic */ void e(int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "serialized size must be non-negative, was ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void f(int i, int i2, Throwable th) {
        throw new zzce(i, i2, th);
    }

    public static /* synthetic */ void g(int i, Object obj, Object obj2, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(i);
        sb.append((Object) " parameters found ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void j(String str) {
        throw new GeneralSecurityException(str);
    }

    public static /* synthetic */ void k(String str, long j, Object obj, int i, Object obj2) {
        throw new IllegalArgumentException(str + j + obj + i + obj2);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void n() {
        throw new zznm("Protocol message tag had invalid wire type.");
    }

    public static /* synthetic */ void o(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    public static /* synthetic */ void p(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void q(String str) {
        throw new zznn(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void r(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    public static /* synthetic */ void s(String str) {
        throw new IOException(str);
    }

    @Override // defpackage.u94
    public r94[] b() {
        return new r94[]{new lfd()};
    }
}
