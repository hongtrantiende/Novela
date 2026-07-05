package defpackage;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f73  reason: default package */
/* loaded from: classes.dex */
public final class f73 implements Executor {
    public static final f73 b = new f73(0);
    public static final /* synthetic */ f73 c = new f73(1);
    public static final /* synthetic */ f73 d = new f73(2);
    public static final /* synthetic */ f73 e = new f73(3);
    public final /* synthetic */ int a;

    public /* synthetic */ f73(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                return;
            case 1:
                runnable.run();
                return;
            case 2:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
