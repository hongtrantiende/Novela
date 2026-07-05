package defpackage;

import android.os.Trace;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t51  reason: default package */
/* loaded from: classes.dex */
public final class t51 implements Runnable {
    public static final /* synthetic */ t51 b = new t51(3);
    public static final /* synthetic */ t51 c = new t51(5);
    public static final /* synthetic */ t51 d = new t51(6);
    public final /* synthetic */ int a;

    public t51(k57 k57Var, int i) {
        this.a = 0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                return;
            case 1:
                try {
                    int i = sic.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (cq3.d()) {
                        cq3.a().e();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i2 = sic.a;
                    Trace.endSection();
                    throw th;
                }
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            default:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
        }
    }

    public /* synthetic */ t51(int i) {
        this.a = i;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final /* synthetic */ void c() {
    }

    private final void d() {
    }

    private final /* synthetic */ void e() {
    }
}
