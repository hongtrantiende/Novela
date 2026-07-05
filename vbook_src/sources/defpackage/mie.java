package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mie  reason: default package */
/* loaded from: classes.dex */
public final class mie extends yje {
    public final /* synthetic */ qke C;
    public final /* synthetic */ int e;
    public final /* synthetic */ ree f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mie(qke qkeVar, ree reeVar, int i) {
        super(qkeVar, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = reeVar;
                Objects.requireNonNull(qkeVar);
                this.C = qkeVar;
                super(qkeVar, true);
                return;
            case 2:
                this.f = reeVar;
                Objects.requireNonNull(qkeVar);
                this.C = qkeVar;
                super(qkeVar, true);
                return;
            default:
                this.f = reeVar;
                Objects.requireNonNull(qkeVar);
                this.C = qkeVar;
                return;
        }
    }

    @Override // defpackage.yje
    public final void a() {
        switch (this.e) {
            case 0:
                yee yeeVar = this.C.f;
                am8.s(yeeVar);
                yeeVar.getGmpAppId(this.f);
                return;
            case 1:
                yee yeeVar2 = this.C.f;
                am8.s(yeeVar2);
                yeeVar2.getCachedAppInstanceId(this.f);
                return;
            case 2:
                yee yeeVar3 = this.C.f;
                am8.s(yeeVar3);
                yeeVar3.generateEventId(this.f);
                return;
            case 3:
                yee yeeVar4 = this.C.f;
                am8.s(yeeVar4);
                yeeVar4.getCurrentScreenName(this.f);
                return;
            default:
                yee yeeVar5 = this.C.f;
                am8.s(yeeVar5);
                yeeVar5.getCurrentScreenClass(this.f);
                return;
        }
    }

    @Override // defpackage.yje
    public final void b() {
        int i = this.e;
        ree reeVar = this.f;
        switch (i) {
            case 0:
                reeVar.D(null);
                return;
            case 1:
                reeVar.D(null);
                return;
            case 2:
                reeVar.D(null);
                return;
            case 3:
                reeVar.D(null);
                return;
            default:
                reeVar.D(null);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mie(qke qkeVar, ree reeVar, int i, boolean z) {
        super(qkeVar, true);
        this.e = i;
        this.f = reeVar;
        this.C = qkeVar;
    }
}
