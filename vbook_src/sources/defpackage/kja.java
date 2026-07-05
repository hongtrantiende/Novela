package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kja  reason: default package */
/* loaded from: classes3.dex */
public final class kja extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ lja c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kja(lja ljaVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = ljaVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        lja ljaVar = this.c;
        switch (i) {
            case 0:
                return new kja(ljaVar, m42Var, 0);
            case 1:
                return new kja(ljaVar, m42Var, 1);
            case 2:
                return new kja(ljaVar, m42Var, 2);
            case 3:
                return new kja(ljaVar, m42Var, 3);
            default:
                return new kja(ljaVar, m42Var, 4);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((kja) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((kja) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((kja) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((kja) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((kja) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        n82 n82Var = n82.a;
        lja ljaVar = this.c;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    ja w = z1d.w(((en6) ljaVar.d).b(), new mx(ljaVar.C, 4), new mx(ljaVar.D, 4), new mx(ljaVar.E, 4), new mx(ljaVar.F, 4), new ija(0, null));
                    jja jjaVar = new jja(ljaVar, 0);
                    this.b = 1;
                    if (w.a(jjaVar, this) == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    eb1 j = ((plc) ljaVar.e).j();
                    jja jjaVar2 = new jja(ljaVar, 1);
                    this.b = 1;
                    if (j.a(jjaVar2, this) == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    gk2 gk2Var = ((bn6) ljaVar.c).a.c;
                    gk2Var.getClass();
                    kl2 kl2Var = kl2.a;
                    s02 O = v9e.O(new uk2(gk2Var, 20L, new kk2(gk2Var, 6), 0));
                    sw2 sw2Var = ab3.a;
                    hs0 hs0Var = new hs0(v9e.z(O, ru2.c), 15);
                    mx mxVar = new mx(ljaVar.G, 4);
                    sr5 sr5Var = new sr5(3, 1, null);
                    jja jjaVar3 = new jja(ljaVar, 2);
                    this.b = 1;
                    Object k = mwe.k(this, jjaVar3, xd0.e, new we1(sr5Var, (m42) null, 6), new sj4[]{hs0Var, mxVar});
                    if (k != n82Var) {
                        k = pvcVar;
                    }
                    if (k == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 3:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    gk2 gk2Var2 = ((bn6) ljaVar.c).a.c;
                    gk2Var2.getClass();
                    ll2 ll2Var = ll2.a;
                    s02 O2 = v9e.O(new uk2(gk2Var2, 20L, new kk2(gk2Var2, 3), 1));
                    sw2 sw2Var2 = ab3.a;
                    hs0 hs0Var2 = new hs0(v9e.z(O2, ru2.c), 16);
                    mx mxVar2 = new mx(ljaVar.G, 4);
                    sr5 sr5Var2 = new sr5(3, 2, null);
                    jja jjaVar4 = new jja(ljaVar, 3);
                    this.b = 1;
                    Object k2 = mwe.k(this, jjaVar4, xd0.e, new we1(sr5Var2, (m42) null, 6), new sj4[]{hs0Var2, mxVar2});
                    if (k2 != n82Var) {
                        k2 = pvcVar;
                    }
                    if (k2 == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            default:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    gk2 gk2Var3 = ((bn6) ljaVar.c).a.c;
                    gk2Var3.getClass();
                    jl2 jl2Var = jl2.a;
                    mm mmVar = (mm) gk2Var3.a;
                    kk2 kk2Var = new kk2(gk2Var3, 9);
                    mmVar.getClass();
                    s02 O3 = v9e.O(new xla(1401148740, new String[]{"DbBook"}, mmVar, "DbBook.sq", "getByLastAddNotView", "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nWHERE location = 1 AND lastRead = 0\nORDER BY createAt DESC", kk2Var));
                    sw2 sw2Var3 = ab3.a;
                    hs0 hs0Var3 = new hs0(v9e.z(O3, ru2.c), 14);
                    mx mxVar3 = new mx(ljaVar.G, 4);
                    sr5 sr5Var3 = new sr5(3, 3, null);
                    jja jjaVar5 = new jja(ljaVar, 4);
                    this.b = 1;
                    Object k3 = mwe.k(this, jjaVar5, xd0.e, new we1(sr5Var3, (m42) null, 6), new sj4[]{hs0Var3, mxVar3});
                    if (k3 != n82Var) {
                        k3 = pvcVar;
                    }
                    if (k3 == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
        }
    }
}
