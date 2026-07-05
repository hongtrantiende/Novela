package defpackage;

import android.app.Activity;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fke  reason: default package */
/* loaded from: classes.dex */
public final class fke extends yje {
    public final /* synthetic */ gb4 C;
    public final /* synthetic */ int e;
    public final /* synthetic */ Activity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fke(gb4 gb4Var, Activity activity, int i) {
        super((qke) gb4Var.b, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = activity;
                this.C = gb4Var;
                super((qke) gb4Var.b, true);
                return;
            case 2:
                this.f = activity;
                this.C = gb4Var;
                super((qke) gb4Var.b, true);
                return;
            case 3:
                this.f = activity;
                this.C = gb4Var;
                super((qke) gb4Var.b, true);
                return;
            case 4:
                this.f = activity;
                this.C = gb4Var;
                super((qke) gb4Var.b, true);
                return;
            default:
                this.f = activity;
                this.C = gb4Var;
                return;
        }
    }

    @Override // defpackage.yje
    public final void a() {
        switch (this.e) {
            case 0:
                yee yeeVar = ((qke) this.C.b).f;
                am8.s(yeeVar);
                yeeVar.onActivityStartedByScionActivityInfo(ahe.c(this.f), this.b);
                return;
            case 1:
                yee yeeVar2 = ((qke) this.C.b).f;
                am8.s(yeeVar2);
                yeeVar2.onActivityResumedByScionActivityInfo(ahe.c(this.f), this.b);
                return;
            case 2:
                yee yeeVar3 = ((qke) this.C.b).f;
                am8.s(yeeVar3);
                yeeVar3.onActivityPausedByScionActivityInfo(ahe.c(this.f), this.b);
                return;
            case 3:
                yee yeeVar4 = ((qke) this.C.b).f;
                am8.s(yeeVar4);
                yeeVar4.onActivityStoppedByScionActivityInfo(ahe.c(this.f), this.b);
                return;
            default:
                yee yeeVar5 = ((qke) this.C.b).f;
                am8.s(yeeVar5);
                yeeVar5.onActivityDestroyedByScionActivityInfo(ahe.c(this.f), this.b);
                return;
        }
    }
}
