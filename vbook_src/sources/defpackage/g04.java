package defpackage;

import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g04  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class g04 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g04(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ggb) obj).d(runnable);
                return;
            default:
                ((View) obj).postOnAnimation(runnable);
                return;
        }
    }
}
