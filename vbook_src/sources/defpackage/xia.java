package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xia  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class xia implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aia b;
    public final /* synthetic */ int c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ xt4 e;

    public /* synthetic */ xia(aia aiaVar, int i, xt4 xt4Var, xt4 xt4Var2, int i2) {
        this.a = i2;
        this.b = aiaVar;
        this.c = i;
        this.d = xt4Var;
        this.e = xt4Var2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        vf6 vf6Var;
        xt4 xt4Var;
        List list;
        List list2;
        aia aiaVar;
        xt4 xt4Var2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.c;
        switch (i) {
            case 0:
                vf6 vf6Var2 = (vf6) obj;
                vf6Var2.getClass();
                final aia aiaVar2 = this.b;
                List list3 = aiaVar2.h;
                List list4 = aiaVar2.j;
                List list5 = aiaVar2.i;
                List list6 = aiaVar2.g;
                boolean isEmpty = list3.isEmpty();
                final xt4 xt4Var3 = this.d;
                final xt4 xt4Var4 = this.e;
                if (!isEmpty) {
                    vf6.y(vf6Var2, "last_add_grid2", new gda(18), cae.e, 4);
                    vf6.y(vf6Var2, "last_add_grid2_content", new gda(21), new tu1(new mu4() { // from class: bja
                        @Override // defpackage.mu4
                        public final Object c(Object obj2, Object obj3, Object obj4) {
                            int i3 = r4;
                            pvc pvcVar2 = pvc.a;
                            kq7 kq7Var = kq7.a;
                            boolean z = false;
                            aia aiaVar3 = aiaVar2;
                            switch (i3) {
                                case 0:
                                    rv4 rv4Var = (rv4) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    ((yf6) obj2).getClass();
                                    if ((intValue & 17) != 16) {
                                        z = true;
                                    }
                                    if (rv4Var.U(intValue & 1, z)) {
                                        oue.a(aiaVar3.h, zbe.C(pna.j(kq7Var, 24.0f, nae.e, 2), 4.0f, 12.0f, nae.e, 8.0f, 4), xt4Var3, xt4Var4, rv4Var, 0);
                                    } else {
                                        rv4Var.X();
                                    }
                                    return pvcVar2;
                                default:
                                    rv4 rv4Var2 = (rv4) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    ((yf6) obj2).getClass();
                                    if ((intValue2 & 17) != 16) {
                                        z = true;
                                    }
                                    if (rv4Var2.U(intValue2 & 1, z)) {
                                        oue.a(aiaVar3.h, zbe.C(pna.j(kq7Var, 24.0f, nae.e, 2), 4.0f, 12.0f, nae.e, 8.0f, 4), xt4Var3, xt4Var4, rv4Var2, 0);
                                    } else {
                                        rv4Var2.X();
                                    }
                                    return pvcVar2;
                            }
                        }
                    }, true, -834100682), 4);
                }
                if (!list6.isEmpty()) {
                    vf6.y(vf6Var2, "recent_grid2", new gda(22), cae.f, 4);
                    final List v0 = sl1.v0(list6, 6);
                    vf6.y(vf6Var2, "recent_grid1_content", new gda(23), new tu1(new mu4() { // from class: cja
                        @Override // defpackage.mu4
                        public final Object c(Object obj2, Object obj3, Object obj4) {
                            int i3 = r4;
                            pvc pvcVar2 = pvc.a;
                            kq7 kq7Var = kq7.a;
                            boolean z = false;
                            switch (i3) {
                                case 0:
                                    rv4 rv4Var = (rv4) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    ((yf6) obj2).getClass();
                                    if ((intValue & 17) != 16) {
                                        z = true;
                                    }
                                    if (rv4Var.U(intValue & 1, z)) {
                                        oue.a(v0, zbe.C(pna.j(kq7Var, 24.0f, nae.e, 2), 4.0f, 12.0f, nae.e, 8.0f, 4), xt4Var3, xt4Var4, rv4Var, 0);
                                    } else {
                                        rv4Var.X();
                                    }
                                    return pvcVar2;
                                default:
                                    rv4 rv4Var2 = (rv4) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    ((yf6) obj2).getClass();
                                    if ((intValue2 & 17) != 16) {
                                        z = true;
                                    }
                                    if (rv4Var2.U(intValue2 & 1, z)) {
                                        oue.a(v0, zbe.C(pna.j(kq7Var, 24.0f, nae.e, 2), 4.0f, 12.0f, nae.e, 8.0f, 4), xt4Var3, xt4Var4, rv4Var2, 0);
                                    } else {
                                        rv4Var2.X();
                                    }
                                    return pvcVar2;
                            }
                        }
                    }, true, 387425901), 4);
                    final List Y = sl1.Y(list6, 2);
                    vf6.A(vf6Var2, Math.min(i2, Y.size()), new vd1(3, Y), new gda(19), new tu1(new nu4() { // from class: dja
                        @Override // defpackage.nu4
                        public final Object h(Object obj2, Object obj3, Object obj4, Object obj5) {
                            int i3;
                            int i4;
                            int i5 = r5;
                            pvc pvcVar2 = pvc.a;
                            kq7 kq7Var = kq7.a;
                            boolean z = false;
                            int i6 = 16;
                            int i7 = 2;
                            aia aiaVar3 = aiaVar2;
                            List list7 = Y;
                            switch (i5) {
                                case 0:
                                    yf6 yf6Var = (yf6) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    rv4 rv4Var = (rv4) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    yf6Var.getClass();
                                    if ((intValue2 & 6) == 0) {
                                        if (rv4Var.f(yf6Var)) {
                                            i7 = 4;
                                        }
                                        i3 = intValue2 | i7;
                                    } else {
                                        i3 = intValue2;
                                    }
                                    if ((intValue2 & 48) == 0) {
                                        if (rv4Var.d(intValue)) {
                                            i6 = 32;
                                        }
                                        i3 |= i6;
                                    }
                                    if ((i3 & Token.EXPR_VOID) != 146) {
                                        z = true;
                                    }
                                    if (rv4Var.U(i3 & 1, z)) {
                                        tl1.b((cia) list7.get(intValue), aiaVar3.d, aiaVar3.e, aiaVar3.f, yf6.a(yf6Var, zbe.C(zbe.y(pna.f(kq7Var, 1.0f), 4.0f), nae.e, nae.e, nae.e, 4.0f, 7)), xt4Var3, xt4Var4, rv4Var, 0);
                                    } else {
                                        rv4Var.X();
                                    }
                                    return pvcVar2;
                                default:
                                    yf6 yf6Var2 = (yf6) obj2;
                                    int intValue3 = ((Integer) obj3).intValue();
                                    rv4 rv4Var2 = (rv4) obj4;
                                    int intValue4 = ((Integer) obj5).intValue();
                                    yf6Var2.getClass();
                                    if ((intValue4 & 6) == 0) {
                                        if (rv4Var2.f(yf6Var2)) {
                                            i7 = 4;
                                        }
                                        i4 = intValue4 | i7;
                                    } else {
                                        i4 = intValue4;
                                    }
                                    if ((intValue4 & 48) == 0) {
                                        if (rv4Var2.d(intValue3)) {
                                            i6 = 32;
                                        }
                                        i4 |= i6;
                                    }
                                    if ((i4 & Token.EXPR_VOID) != 146) {
                                        z = true;
                                    }
                                    if (rv4Var2.U(i4 & 1, z)) {
                                        tl1.a((cia) list7.get(intValue3), aiaVar3.d, aiaVar3.e, aiaVar3.f, yf6.a(yf6Var2, zbe.C(zbe.y(pna.f(kq7Var, 1.0f), 4.0f), nae.e, nae.e, nae.e, 8.0f, 7)), xt4Var3, xt4Var4, rv4Var2, 0);
                                    } else {
                                        rv4Var2.X();
                                    }
                                    return pvcVar2;
                            }
                        }
                    }, true, -1094788131), 4);
                    vf6Var = vf6Var2;
                } else {
                    vf6Var = vf6Var2;
                }
                if (!list5.isEmpty()) {
                    vf6.y(vf6Var, "last_update_grid2", new gda(24), cae.g, 4);
                    vf6.A(vf6Var, Math.min(i2, list5.size()), new aja(aiaVar2, 3), new gda(19), new tu1(new zia(aiaVar2, xt4Var3, xt4Var4, 3), true, 1160715678), 4);
                }
                if (!list4.isEmpty()) {
                    vf6.y(vf6Var, "often_read_grid2", new gda(20), cae.h, 4);
                    vf6.A(vf6Var, Math.min(i2, list4.size()), new aja(aiaVar2, 4), new gda(19), new tu1(new zia(aiaVar2, xt4Var3, xt4Var4, 4), true, -878747809), 4);
                }
                return pvcVar;
            default:
                vf6 vf6Var3 = (vf6) obj;
                vf6Var3.getClass();
                final aia aiaVar3 = this.b;
                List list7 = aiaVar3.h;
                List list8 = aiaVar3.j;
                List list9 = aiaVar3.i;
                List list10 = aiaVar3.g;
                boolean isEmpty2 = list7.isEmpty();
                final xt4 xt4Var5 = this.d;
                final xt4 xt4Var6 = this.e;
                if (!isEmpty2) {
                    vf6.y(vf6Var3, "last_add_grid1", new eja(1), cae.a, 4);
                    vf6.y(vf6Var3, "last_add_grid1_content", new eja(4), new tu1(new mu4() { // from class: bja
                        @Override // defpackage.mu4
                        public final Object c(Object obj2, Object obj3, Object obj4) {
                            int i3 = r4;
                            pvc pvcVar2 = pvc.a;
                            kq7 kq7Var = kq7.a;
                            boolean z = false;
                            aia aiaVar32 = aiaVar3;
                            switch (i3) {
                                case 0:
                                    rv4 rv4Var = (rv4) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    ((yf6) obj2).getClass();
                                    if ((intValue & 17) != 16) {
                                        z = true;
                                    }
                                    if (rv4Var.U(intValue & 1, z)) {
                                        oue.a(aiaVar32.h, zbe.C(pna.j(kq7Var, 24.0f, nae.e, 2), 4.0f, 12.0f, nae.e, 8.0f, 4), xt4Var5, xt4Var6, rv4Var, 0);
                                    } else {
                                        rv4Var.X();
                                    }
                                    return pvcVar2;
                                default:
                                    rv4 rv4Var2 = (rv4) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    ((yf6) obj2).getClass();
                                    if ((intValue2 & 17) != 16) {
                                        z = true;
                                    }
                                    if (rv4Var2.U(intValue2 & 1, z)) {
                                        oue.a(aiaVar32.h, zbe.C(pna.j(kq7Var, 24.0f, nae.e, 2), 4.0f, 12.0f, nae.e, 8.0f, 4), xt4Var5, xt4Var6, rv4Var2, 0);
                                    } else {
                                        rv4Var2.X();
                                    }
                                    return pvcVar2;
                            }
                        }
                    }, true, -1536035275), 4);
                }
                if (!list10.isEmpty()) {
                    vf6.y(vf6Var3, "recent_grid1", new eja(5), cae.b, 4);
                    final List v02 = sl1.v0(list10, 6);
                    vf6.y(vf6Var3, "recent_grid1_content", new eja(6), new tu1(new mu4() { // from class: cja
                        @Override // defpackage.mu4
                        public final Object c(Object obj2, Object obj3, Object obj4) {
                            int i3 = r4;
                            pvc pvcVar2 = pvc.a;
                            kq7 kq7Var = kq7.a;
                            boolean z = false;
                            switch (i3) {
                                case 0:
                                    rv4 rv4Var = (rv4) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    ((yf6) obj2).getClass();
                                    if ((intValue & 17) != 16) {
                                        z = true;
                                    }
                                    if (rv4Var.U(intValue & 1, z)) {
                                        oue.a(v02, zbe.C(pna.j(kq7Var, 24.0f, nae.e, 2), 4.0f, 12.0f, nae.e, 8.0f, 4), xt4Var5, xt4Var6, rv4Var, 0);
                                    } else {
                                        rv4Var.X();
                                    }
                                    return pvcVar2;
                                default:
                                    rv4 rv4Var2 = (rv4) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    ((yf6) obj2).getClass();
                                    if ((intValue2 & 17) != 16) {
                                        z = true;
                                    }
                                    if (rv4Var2.U(intValue2 & 1, z)) {
                                        oue.a(v02, zbe.C(pna.j(kq7Var, 24.0f, nae.e, 2), 4.0f, 12.0f, nae.e, 8.0f, 4), xt4Var5, xt4Var6, rv4Var2, 0);
                                    } else {
                                        rv4Var2.X();
                                    }
                                    return pvcVar2;
                            }
                        }
                    }, true, -314508692), 4);
                    final List Y2 = sl1.Y(list10, 2);
                    int min = Math.min(i2, Y2.size());
                    vd1 vd1Var = new vd1(4, Y2);
                    eja ejaVar = new eja(2);
                    list = list8;
                    list2 = list9;
                    nu4 nu4Var = new nu4() { // from class: dja
                        @Override // defpackage.nu4
                        public final Object h(Object obj2, Object obj3, Object obj4, Object obj5) {
                            int i3;
                            int i4;
                            int i5 = r5;
                            pvc pvcVar2 = pvc.a;
                            kq7 kq7Var = kq7.a;
                            boolean z = false;
                            int i6 = 16;
                            int i7 = 2;
                            aia aiaVar32 = aiaVar3;
                            List list72 = Y2;
                            switch (i5) {
                                case 0:
                                    yf6 yf6Var = (yf6) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    rv4 rv4Var = (rv4) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    yf6Var.getClass();
                                    if ((intValue2 & 6) == 0) {
                                        if (rv4Var.f(yf6Var)) {
                                            i7 = 4;
                                        }
                                        i3 = intValue2 | i7;
                                    } else {
                                        i3 = intValue2;
                                    }
                                    if ((intValue2 & 48) == 0) {
                                        if (rv4Var.d(intValue)) {
                                            i6 = 32;
                                        }
                                        i3 |= i6;
                                    }
                                    if ((i3 & Token.EXPR_VOID) != 146) {
                                        z = true;
                                    }
                                    if (rv4Var.U(i3 & 1, z)) {
                                        tl1.b((cia) list72.get(intValue), aiaVar32.d, aiaVar32.e, aiaVar32.f, yf6.a(yf6Var, zbe.C(zbe.y(pna.f(kq7Var, 1.0f), 4.0f), nae.e, nae.e, nae.e, 4.0f, 7)), xt4Var5, xt4Var6, rv4Var, 0);
                                    } else {
                                        rv4Var.X();
                                    }
                                    return pvcVar2;
                                default:
                                    yf6 yf6Var2 = (yf6) obj2;
                                    int intValue3 = ((Integer) obj3).intValue();
                                    rv4 rv4Var2 = (rv4) obj4;
                                    int intValue4 = ((Integer) obj5).intValue();
                                    yf6Var2.getClass();
                                    if ((intValue4 & 6) == 0) {
                                        if (rv4Var2.f(yf6Var2)) {
                                            i7 = 4;
                                        }
                                        i4 = intValue4 | i7;
                                    } else {
                                        i4 = intValue4;
                                    }
                                    if ((intValue4 & 48) == 0) {
                                        if (rv4Var2.d(intValue3)) {
                                            i6 = 32;
                                        }
                                        i4 |= i6;
                                    }
                                    if ((i4 & Token.EXPR_VOID) != 146) {
                                        z = true;
                                    }
                                    if (rv4Var2.U(i4 & 1, z)) {
                                        tl1.a((cia) list72.get(intValue3), aiaVar32.d, aiaVar32.e, aiaVar32.f, yf6.a(yf6Var2, zbe.C(zbe.y(pna.f(kq7Var, 1.0f), 4.0f), nae.e, nae.e, nae.e, 8.0f, 7)), xt4Var5, xt4Var6, rv4Var2, 0);
                                    } else {
                                        rv4Var2.X();
                                    }
                                    return pvcVar2;
                            }
                        }
                    };
                    aiaVar = aiaVar3;
                    xt4Var2 = xt4Var5;
                    xt4Var = xt4Var6;
                    vf6.A(vf6Var3, min, vd1Var, ejaVar, new tu1(nu4Var, true, -1796722724), 4);
                } else {
                    xt4Var = xt4Var6;
                    list = list8;
                    list2 = list9;
                    aiaVar = aiaVar3;
                    xt4Var2 = xt4Var5;
                }
                if (!list2.isEmpty()) {
                    vf6.y(vf6Var3, "last_update_grid1", new eja(7), cae.c, 4);
                    vf6.A(vf6Var3, Math.min(i2, list2.size()), new aja(aiaVar, 8), new eja(2), new tu1(new zia(aiaVar, xt4Var2, xt4Var, 8), true, 458781085), 4);
                }
                if (!list.isEmpty()) {
                    vf6.y(vf6Var3, "often_read_grid1", new eja(3), cae.d, 4);
                    vf6.A(vf6Var3, Math.min(i2, list.size()), new aja(aiaVar, 9), new eja(2), new tu1(new zia(aiaVar, xt4Var2, xt4Var, 9), true, -1580682402), 4);
                }
                return pvcVar;
        }
    }
}
