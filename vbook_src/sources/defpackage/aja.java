package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aja  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class aja implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aia b;

    public /* synthetic */ aja(aia aiaVar, int i) {
        this.a = i;
        this.b = aiaVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        int intValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                return rs8.i(this.b.j.get(intValue), "often_read_list1_");
            case 1:
                return rs8.i(this.b.g.get(intValue), "recent_list1_");
            case 2:
                return rs8.i(this.b.i.get(intValue), "last_update_list1_");
            case 3:
                return rs8.i(this.b.i.get(intValue), "last_update_grid2_");
            case 4:
                return rs8.i(this.b.j.get(intValue), "often_read_grid2_");
            case 5:
                return rs8.i(this.b.j.get(intValue), "often_read_list2_");
            case 6:
                return rs8.i(this.b.g.get(intValue), "recent_list2_");
            case 7:
                return rs8.i(this.b.i.get(intValue), "last_update_list2_");
            case 8:
                return s21.m("last_update_grid1_", ((cia) this.b.i.get(intValue)).a);
            default:
                return s21.m("often_read_grid1_", ((cia) this.b.j.get(intValue)).a);
        }
    }
}
