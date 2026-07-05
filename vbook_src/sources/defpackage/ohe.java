package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ohe  reason: default package */
/* loaded from: classes.dex */
public final class ohe extends yje {
    public final /* synthetic */ String C;
    public final /* synthetic */ qke D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohe(qke qkeVar, ahe aheVar, String str, String str2) {
        super(qkeVar, true);
        this.E = aheVar;
        this.f = str;
        this.C = str2;
        Objects.requireNonNull(qkeVar);
        this.D = qkeVar;
    }

    @Override // defpackage.yje
    public final void a() {
        switch (this.e) {
            case 0:
                yee yeeVar = this.D.f;
                am8.s(yeeVar);
                yeeVar.getConditionalUserProperties(this.f, this.C, (ree) this.E);
                return;
            default:
                yee yeeVar2 = this.D.f;
                am8.s(yeeVar2);
                yeeVar2.setCurrentScreenByScionActivityInfo((ahe) this.E, this.f, this.C, this.a);
                return;
        }
    }

    @Override // defpackage.yje
    public void b() {
        switch (this.e) {
            case 0:
                ((ree) this.E).D(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohe(qke qkeVar, String str, String str2, ree reeVar) {
        super(qkeVar, true);
        this.f = str;
        this.C = str2;
        this.E = reeVar;
        this.D = qkeVar;
    }
}
