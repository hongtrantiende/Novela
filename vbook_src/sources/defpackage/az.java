package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.Proxy;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: az  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class az implements Executor {
    public final /* synthetic */ int a;

    public /* synthetic */ az(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                bz.R().d.e.execute(runnable);
                return;
            case 1:
                runnable.run();
                return;
            case 2:
                return;
            default:
                Proxy.a(runnable);
                return;
        }
    }

    private final void a(Runnable runnable) {
    }
}
