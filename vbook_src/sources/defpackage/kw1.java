package defpackage;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kw1  reason: default package */
/* loaded from: classes.dex */
public final class kw1 implements ScrollCaptureCallback {
    public final b8a a;
    public final uy5 b;
    public final zz8 c;
    public final rg d;
    public final m41 e;
    public final s95 f;

    public kw1(b8a b8aVar, uy5 uy5Var, m41 m41Var, zz8 zz8Var, rg rgVar) {
        this.a = b8aVar;
        this.b = uy5Var;
        this.c = zz8Var;
        this.d = rgVar;
        this.e = new m41(m41Var.b.plus(l73.b));
        this.f = new s95(uy5Var.b(), new jw1(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r3 == r5) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.kw1 r8, android.view.ScrollCaptureSession r9, defpackage.uy5 r10, defpackage.n42 r11) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw1.a(kw1, android.view.ScrollCaptureSession, uy5, n42):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        z87.v(this.e, u38.b, null, new cv0(this, runnable, null, 14), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        iya v = z87.v(this.e, null, null, new l(this, scrollCaptureSession, rect, consumer, null, 11), 3);
        v.invokeOnCompletion(new mw1(cancellationSignal, 0));
        cancellationSignal.setOnCancelListener(new lw1(v, 0));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(ipe.B(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = nae.e;
        ((hm8) this.c.a).setValue(Boolean.TRUE);
        runnable.run();
    }
}
