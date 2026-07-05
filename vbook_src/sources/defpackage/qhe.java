package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qhe  reason: default package */
/* loaded from: classes.dex */
public final class qhe extends yje {
    public final /* synthetic */ qke C;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhe(qke qkeVar, String str, int i) {
        super(qkeVar, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = str;
                Objects.requireNonNull(qkeVar);
                this.C = qkeVar;
                super(qkeVar, true);
                return;
            case 2:
                this.f = str;
                Objects.requireNonNull(qkeVar);
                this.C = qkeVar;
                super(qkeVar, true);
                return;
            default:
                this.f = str;
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
                yeeVar.setUserId(this.f, this.a);
                return;
            case 1:
                yee yeeVar2 = this.C.f;
                am8.s(yeeVar2);
                yeeVar2.beginAdUnitExposure(this.f, this.b);
                return;
            default:
                yee yeeVar3 = this.C.f;
                am8.s(yeeVar3);
                yeeVar3.endAdUnitExposure(this.f, this.b);
                return;
        }
    }
}
