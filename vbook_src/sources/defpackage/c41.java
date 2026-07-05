package defpackage;

import android.util.Log;
import java.util.logging.Level;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c41  reason: default package */
/* loaded from: classes.dex */
public abstract class c41 {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ c41(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public abstract byte[] a(byte[] bArr, h hVar, rse rseVar, byte[] bArr2);

    public abstract byte[] b(byte[] bArr, h hVar, rse rseVar, byte[] bArr2);

    public Object c(r76 r76Var, Object obj) {
        r76Var.getClass();
        return d(this.b);
    }

    public abstract Object d(String str);

    public void e(r76 r76Var, Object obj) {
        r76Var.getClass();
        f(obj, this.b);
    }

    public abstract void f(Object obj, String str);

    public abstract boolean g(Level level);

    public abstract void h(pif pifVar);

    public void i(RuntimeException runtimeException, pif pifVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return this.b;
            default:
                return super.toString();
        }
    }
}
