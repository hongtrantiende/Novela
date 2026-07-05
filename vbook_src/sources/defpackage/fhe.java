package defpackage;

import android.os.Bundle;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fhe  reason: default package */
/* loaded from: classes.dex */
public final class fhe extends yje {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e;
    public final /* synthetic */ qke f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhe(qke qkeVar, Exception exc) {
        super(qkeVar, false);
        this.e = 3;
        this.C = exc;
        this.f = qkeVar;
    }

    @Override // defpackage.yje
    public final void a() {
        switch (this.e) {
            case 0:
                yee yeeVar = this.f.f;
                am8.s(yeeVar);
                yeeVar.setUserProperty("fcm", "_ln", new n78(this.C), true, this.a);
                return;
            case 1:
                yee yeeVar2 = this.f.f;
                am8.s(yeeVar2);
                yeeVar2.setConditionalUserProperty((Bundle) this.C, this.a);
                return;
            case 2:
                yee yeeVar3 = this.f.f;
                am8.s(yeeVar3);
                yeeVar3.retrieveAndUploadBatches(new iie(this, (w1f) this.C));
                return;
            case 3:
                yee yeeVar4 = this.f.f;
                am8.s(yeeVar4);
                yeeVar4.logHealthData(5, "Error with data collection. Data lost.", new n78((Exception) this.C), new n78(null), new n78(null));
                return;
            default:
                yee yeeVar5 = this.f.f;
                am8.s(yeeVar5);
                yeeVar5.registerOnMeasurementEventListener((bke) this.C);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fhe(qke qkeVar, Object obj, int i) {
        super(qkeVar, true);
        this.e = i;
        this.C = obj;
        this.f = qkeVar;
    }
}
