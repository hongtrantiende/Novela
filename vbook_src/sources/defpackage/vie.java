package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vie  reason: default package */
/* loaded from: classes.dex */
public final class vie extends yje {
    public final /* synthetic */ boolean C;
    public final /* synthetic */ ree D;
    public final /* synthetic */ qke E;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vie(qke qkeVar, String str, String str2, boolean z, ree reeVar) {
        super(qkeVar, true);
        this.e = str;
        this.f = str2;
        this.C = z;
        this.D = reeVar;
        this.E = qkeVar;
    }

    @Override // defpackage.yje
    public final void a() {
        yee yeeVar = this.E.f;
        am8.s(yeeVar);
        yeeVar.getUserProperties(this.e, this.f, this.C, this.D);
    }

    @Override // defpackage.yje
    public final void b() {
        this.D.D(null);
    }
}
