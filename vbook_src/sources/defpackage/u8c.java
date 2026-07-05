package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u8c  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class u8c implements vt4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ z8c d;

    public /* synthetic */ u8c(int i, String str, z8c z8cVar) {
        this.b = i;
        this.c = str;
        this.d = z8cVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        StringBuilder s;
        g7b g7bVar;
        switch (this.a) {
            case 0:
                s = s21.s("TileManager. refreshTiles:", this.c, ". interrupted, rotation is not a multiple of 90: ", this.b, ". '");
                g7bVar = this.d.b;
                break;
            default:
                c52.a.getClass();
                s = nk2.y("TileManager. refreshTiles:", this.c, ". interrupted, continuousTransformType is ", b52.a(this.b), ". '");
                g7bVar = this.d.b;
                break;
        }
        return rs8.h(g7bVar, s, '\'');
    }

    public /* synthetic */ u8c(String str, int i, z8c z8cVar) {
        this.c = str;
        this.b = i;
        this.d = z8cVar;
    }
}
