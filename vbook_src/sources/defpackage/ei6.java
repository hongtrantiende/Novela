package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ei6  reason: default package */
/* loaded from: classes.dex */
public final class ei6 {
    public final xt4 a;
    public o40 c;
    public int f;
    public final zg4 b = new zg4(25);
    public int d = -1;
    public int e = -1;

    public ei6(xt4 xt4Var) {
        this.a = xt4Var;
    }

    public final di6 a(int i, long j, boolean z, xt4 xt4Var) {
        o40 o40Var = this.c;
        if (o40Var != null) {
            a59 a59Var = (a59) o40Var.d;
            boolean z2 = a59Var instanceof vk;
            z49 z49Var = new z49(o40Var, i, this.b, xt4Var);
            z49Var.d = new x02(j);
            if (z2) {
                if (z) {
                    vk vkVar = (vk) a59Var;
                    vkVar.b.add(new f69(1, z49Var));
                    if (!vkVar.c) {
                        vkVar.c = true;
                        vkVar.a.post(vkVar);
                    }
                } else {
                    vk vkVar2 = (vk) a59Var;
                    vkVar2.b.add(new f69(0, z49Var));
                    if (!vkVar2.c) {
                        vkVar2.c = true;
                        vkVar2.a.post(vkVar2);
                    }
                }
            } else {
                a59Var.a(z49Var);
            }
            ff.G(i, "compose:lazy:schedule_prefetch:index");
            return z49Var;
        }
        return vl3.a;
    }
}
