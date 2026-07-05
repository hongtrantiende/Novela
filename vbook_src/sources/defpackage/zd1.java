package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zd1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zd1 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zd1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.a;
        int i2 = 16;
        lh9 lh9Var = ax1.a;
        int i3 = 4;
        kq7 kq7Var = kq7.a;
        boolean z4 = true;
        boolean z5 = false;
        pvc pvcVar = pvc.a;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                cz7 cz7Var = (cz7) obj5;
                rh8 rh8Var = (rh8) obj2;
                rv4 rv4Var = (rv4) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var.getClass();
                if ((intValue & 48) == 0) {
                    if (rv4Var.f(rh8Var)) {
                        i2 = 32;
                    }
                    intValue |= i2;
                }
                int i4 = intValue;
                if ((i4 & Token.TARGET) == 144) {
                    z4 = false;
                }
                if (rv4Var.U(i4 & 1, z4)) {
                    ze4 ze4Var = pna.c;
                    boolean f = rv4Var.f(cz7Var);
                    Object P = rv4Var.P();
                    if (f || P == lh9Var) {
                        P = new ar0(cz7Var, 2);
                        rv4Var.o0(P);
                    }
                    xt4 xt4Var = (xt4) P;
                    boolean f2 = rv4Var.f(cz7Var);
                    Object P2 = rv4Var.P();
                    if (f2 || P2 == lh9Var) {
                        v7 v7Var = new v7(0, cz7Var, zr1.class, "navigateToPublicConversationList", "navigateToPublicConversationList(Lcom/core/navigation/NavBackStack;)V", 1, 4);
                        rv4Var.o0(v7Var);
                        P2 = v7Var;
                    }
                    fbe.h(((i4 << 3) & 896) | 54, (vt4) ((i76) P2), xt4Var, rv4Var, ze4Var, rh8Var);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                wj wjVar = (wj) obj5;
                ctc b = ((go4) wjVar.e).b((eo4) obj, (dq4) obj2, ((wp4) obj3).a, ((xp4) obj4).a);
                if (!(b instanceof btc)) {
                    yx9 yx9Var = new yx9(b, wjVar.F);
                    wjVar.F = yx9Var;
                    Object obj6 = yx9Var.d;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                Object obj7 = ((btc) b).a;
                obj7.getClass();
                return (Typeface) obj7;
            case 2:
                yya yyaVar = (yya) obj5;
                rh8 rh8Var2 = (rh8) obj2;
                rv4 rv4Var2 = (rv4) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var2.getClass();
                if ((intValue2 & 48) == 0) {
                    if (rv4Var2.f(rh8Var2)) {
                        i2 = 32;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & Token.TARGET) != 144) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    ((m44) yyaVar.getValue()).getClass();
                    rv4Var2.e0(-1646129519);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 3:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                ((p9b) obj5).r(new ot4(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            case 4:
                tu1 tu1Var = (tu1) obj5;
                yj6 yj6Var = (yj6) obj;
                ((Integer) obj2).getClass();
                rv4 rv4Var3 = (rv4) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                if ((intValue3 & 6) == 0) {
                    if (!rv4Var3.f(yj6Var)) {
                        i3 = 2;
                    }
                    intValue3 |= i3;
                }
                if ((intValue3 & Token.DO) == 130) {
                    z4 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z4)) {
                    tu1Var.c(yj6Var, rv4Var3, Integer.valueOf(intValue3 & 14));
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 5:
                rb1 rb1Var = (rb1) obj5;
                ((Integer) obj2).getClass();
                rv4 rv4Var4 = (rv4) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                ((xg6) obj).getClass();
                if ((intValue4 & Token.DEFAULT) != 128) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var4.U(intValue4 & 1, z2)) {
                    String str = rb1Var.b;
                    tza tzaVar = j27.a;
                    oyb oybVar = ((h27) rv4Var4.j(tzaVar)).b.h;
                    long j = ((h27) rv4Var4.j(tzaVar)).a.q;
                    nq7 f3 = pna.f(kq7Var, 1.0f);
                    Object P3 = rv4Var4.P();
                    if (P3 == lh9Var) {
                        P3 = new cd1(15);
                        rv4Var4.o0(P3);
                    }
                    cvb.c(str, zbe.y(nmd.v(q1d.t(1, (vt4) P3, rv4Var4, f3, false), rm1.g(((h27) rv4Var4.j(tzaVar)).a, 0.5f), lre.g), 12.0f), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var4, 0, 0, 131064);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 6:
                y78 y78Var = (y78) obj;
                y78 y78Var2 = (y78) obj2;
                float floatValue = ((Float) obj3).floatValue();
                ((Float) obj4).getClass();
                hm8 hm8Var = ((ro3) obj5).l;
                hm8Var.setValue(Integer.valueOf(dce.n((int) (((Number) hm8Var.getValue()).floatValue() * floatValue), 8, 50)));
                return pvcVar;
            case 7:
                f7a f7aVar = (f7a) obj5;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                sc6 sc6Var = (sc6) obj2;
                y78 y78Var3 = (y78) obj3;
                h6a h6aVar = (h6a) obj4;
                long a = sc6Var.a();
                rk9 rk9Var = new rk9(nae.e, nae.e, (int) (a >> 32), (int) (a & 4294967295L));
                boolean q = yte.q(y78Var3.a, rk9Var);
                long j2 = y78Var3.a;
                if (!q) {
                    j2 = pye.g(j2, rk9Var);
                }
                long d = f7aVar.d(sc6Var, j2);
                if ((9223372034707292159L & d) != 9205357640488583168L) {
                    f7aVar.n(booleanValue);
                    f7aVar.N = null;
                    f7aVar.s(d, 9205357640488583168L, false, h6aVar);
                    zm4.a(f7aVar.D);
                    f7aVar.p(false);
                    f7aVar.O = true;
                }
                return pvcVar;
            case 8:
                String str2 = (String) obj5;
                ((Integer) obj2).getClass();
                rv4 rv4Var5 = (rv4) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                ((xg6) obj).getClass();
                if ((intValue5 & Token.DEFAULT) != 128) {
                    z5 = true;
                }
                if (rv4Var5.U(intValue5 & 1, z5)) {
                    tza tzaVar2 = j27.a;
                    cvb.c(str2, zbe.z(nmd.v(pna.f(kq7Var, 1.0f), ((h27) rv4Var5.j(tzaVar2)).a.p, lre.g), 16.0f, 8.0f), ((h27) rv4Var5.j(tzaVar2)).a.a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var5.j(tzaVar2)).b.i, rv4Var5, 0, 0, 131064);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
            case 9:
                Map.Entry entry = (Map.Entry) obj5;
                xg6 xg6Var = (xg6) obj;
                ((Integer) obj2).getClass();
                rv4 rv4Var6 = (rv4) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                xg6Var.getClass();
                if ((intValue6 & 6) == 0) {
                    if (!rv4Var6.f(xg6Var)) {
                        i3 = 2;
                    }
                    intValue6 |= i3;
                }
                if ((intValue6 & Token.DO) != 130) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var6.U(intValue6 & 1, z3)) {
                    xxe.f(((pmb) sl1.c0((List) entry.getValue())).d, zbe.z(nmd.v(xg6.a(xg6Var, pna.f(kq7Var, 1.0f)), rm1.g(((h27) rv4Var6.j(j27.a)).a, 1.0f), lre.g), 20.0f, 4.0f), rv4Var6, 0);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
            case 10:
                cqb cqbVar = (cqb) obj5;
                String str3 = (String) obj;
                String str4 = (String) obj2;
                boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                boolean booleanValue3 = ((Boolean) obj4).booleanValue();
                str3.getClass();
                str4.getClass();
                hk1 a2 = jdd.a(cqbVar);
                sw2 sw2Var = ab3.a;
                cqbVar.f(a2, ru2.c, new de1(cqbVar, booleanValue3, str3, str4, booleanValue2, null, 1));
                return pvcVar;
            case 11:
                String str5 = (String) obj;
                String str6 = (String) obj2;
                String str7 = (String) obj3;
                String str8 = (String) obj4;
                hl5.z(str5, str6, str7, str8);
                ((ho3) obj5).b(str5, str6, str7, str8);
                return pvcVar;
            case 12:
                gbc gbcVar = (gbc) obj5;
                String str9 = (String) obj;
                String str10 = (String) obj2;
                String str11 = (String) obj3;
                String str12 = (String) obj4;
                str9.getClass();
                str10.getClass();
                str11.getClass();
                str12.getClass();
                hk1 a3 = jdd.a(gbcVar);
                sw2 sw2Var2 = ab3.a;
                gbcVar.f(a3, ru2.c, new dv0(gbcVar, str10, str11, str12, str9, null, 3));
                return pvcVar;
            default:
                szc szcVar = (szc) obj5;
                String str13 = (String) obj2;
                String str14 = (String) obj3;
                String str15 = (String) obj4;
                str13.getClass();
                str14.getClass();
                str15.getClass();
                hk1 a4 = jdd.a(szcVar);
                sw2 sw2Var3 = ab3.a;
                szcVar.f(a4, ru2.c, new da(szcVar, str14, str15, str13, (nl5) obj, (m42) null));
                return pvcVar;
        }
    }
}
