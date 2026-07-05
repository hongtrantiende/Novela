package defpackage;

import android.view.contentcapture.ContentCaptureSession;
import com.google.firebase.components.ComponentRegistrar;
import java.nio.charset.Charset;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vm1 */
/* loaded from: classes.dex */
public final /* synthetic */ class vm1 implements te3, ju1, nkc, or6 {
    public final /* synthetic */ int a;

    public static /* bridge */ /* synthetic */ ContentCaptureSession b(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* synthetic */ void d() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void e(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void f(String str, int i, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + i + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void g(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void h() {
        throw new ClassCastException();
    }

    @Override // defpackage.ju1
    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // defpackage.nkc
    public Object apply(Object obj) {
        ei2.b.getClass();
        return sa2.a.h((qa2) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // defpackage.te3
    public double c(double d) {
        switch (this.a) {
            case 0:
                float[] fArr = wm1.a;
                return wm1.b(wm1.c, d);
            case 1:
                float[] fArr2 = wm1.a;
                return wm1.a(wm1.c, d);
            case 2:
                float[] fArr3 = wm1.a;
                return wm1.d(wm1.d, d);
            default:
                float[] fArr4 = wm1.a;
                return wm1.c(wm1.d, d);
        }
    }

    @Override // defpackage.or6
    public void invoke(Object obj) {
        dd ddVar = (dd) obj;
        switch (this.a) {
            case 22:
                ddVar.getClass();
                return;
            case 23:
                ddVar.getClass();
                return;
            case 24:
                ddVar.getClass();
                return;
            case 25:
                ddVar.getClass();
                return;
            case 26:
                ddVar.getClass();
                return;
            case 27:
                ddVar.getClass();
                return;
            case 28:
                ddVar.getClass();
                return;
            default:
                ddVar.getClass();
                return;
        }
    }
}
