package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.inputmethod.BaseInputConnection;
import com.reader.android.MainActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u76  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class u76 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u76(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
    @Override // defpackage.vt4
    public final Object invoke() {
        em8 em8Var;
        String str;
        ?? r2;
        ks3 ks3Var;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ?? r1;
        ks3 ks3Var2;
        String str9;
        Object value;
        int i = this.a;
        String str10 = "";
        ks3 ks3Var3 = ks3.a;
        String str11 = null;
        kq8 kq8Var = null;
        String str12 = null;
        String str13 = null;
        pvc pvcVar = pvc.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((ksc) obj).a.findJavaDeclaration();
            case 1:
                return new ra6(((ko5) ((t42) obj).b).c);
            case 2:
                fb3 fb3Var = ((qh6) obj).j;
                if (fb3Var != null) {
                    hud.o(fb3Var);
                }
                return pvcVar;
            case 3:
                return new BaseInputConnection(((pl6) obj).a, false);
            case 4:
                dx dxVar = ((en6) obj).a;
                hy5 hy5Var = dxVar.E;
                r76[] r76VarArr = dx.W;
                return dza.a(new oia(((Number) hy5Var.c(r76VarArr[29], dxVar)).intValue(), dxVar.e(), dxVar.d(dxVar.e()), ((Number) dxVar.P.c(r76VarArr[41], dxVar)).intValue(), ((Number) dxVar.Q.c(r76VarArr[42], dxVar)).intValue(), ((Boolean) dxVar.G.c(r76VarArr[31], dxVar)).booleanValue(), ((Boolean) dxVar.H.c(r76VarArr[32], dxVar)).booleanValue(), ((Boolean) dxVar.I.c(r76VarArr[33], dxVar)).booleanValue()));
            case 5:
                sx6 sx6Var = (sx6) obj;
                if (!((rx6) sx6Var.d.getValue()).b) {
                    hk1 a = jdd.a(sx6Var);
                    sw2 sw2Var = ab3.a;
                    sx6Var.f(a, ru2.c, new c95(sx6Var, null, 17));
                }
                return pvcVar;
            case 6:
                s17 s17Var = (s17) obj;
                if (s17Var.M.h() <= s17Var.N.h()) {
                    return null;
                }
                ((q17) s17Var.S.getValue()).getClass();
                return Float.valueOf(s17Var.H1() + em8Var.h());
            case 7:
                ad7 ad7Var = (ad7) obj;
                gd7 gd7Var = ad7Var.d;
                String valueOf = String.valueOf(gd7Var.e);
                Map map = ad7Var.f;
                Object obj2 = map.get("title");
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = gd7Var.q;
                }
                String str14 = str;
                Object obj3 = map.get("creator");
                if (obj3 instanceof List) {
                    r2 = (List) obj3;
                } else {
                    r2 = null;
                }
                if (r2 == null) {
                    ks3Var = ks3Var3;
                } else {
                    ks3Var = r2;
                }
                Object obj4 = map.get("publisher");
                if (obj4 instanceof String) {
                    str2 = (String) obj4;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                Object obj5 = map.get("language");
                if (obj5 instanceof String) {
                    str4 = (String) obj5;
                } else {
                    str4 = null;
                }
                if (str4 == null) {
                    str4 = gd7Var.r;
                }
                String str15 = str4;
                Object obj6 = map.get("date");
                if (obj6 instanceof String) {
                    str5 = (String) obj6;
                } else {
                    str5 = null;
                }
                if (str5 == null) {
                    str6 = "";
                } else {
                    str6 = str5;
                }
                Object obj7 = map.get("description");
                if (obj7 instanceof String) {
                    str7 = (String) obj7;
                } else {
                    str7 = null;
                }
                if (str7 == null) {
                    str8 = "";
                } else {
                    str8 = str7;
                }
                Object obj8 = map.get("subject");
                if (obj8 instanceof List) {
                    r1 = (List) obj8;
                } else {
                    r1 = null;
                }
                if (r1 == null) {
                    ks3Var2 = ks3Var3;
                } else {
                    ks3Var2 = r1;
                }
                Object obj9 = map.get("rights");
                if (obj9 instanceof String) {
                    str11 = (String) obj9;
                }
                if (str11 == null) {
                    str9 = "";
                } else {
                    str9 = str11;
                }
                return new hd7(valueOf, str14, ks3Var, str3, str15, str6, str8, ks3Var2, str9);
            case 8:
                ((d8) obj).b();
                return pvcVar;
            case 9:
                ((e13) obj).a(false);
                return pvcVar;
            case 10:
                ((rz4) obj).a(false);
                return pvcVar;
            case 11:
                at5 at5Var = (at5) obj;
                at5Var.a.setValue(Boolean.FALSE);
                at5Var.b.setValue(ks3Var3);
                return pvcVar;
            case 12:
                d1d d1dVar = (d1d) obj;
                fdd.g(d1dVar, jdd.a(d1dVar), new c1d(d1dVar, null, 2));
                return pvcVar;
            case 13:
                oc9 oc9Var = (oc9) sl1.e0(((zwb) obj).d);
                if (oc9Var != null) {
                    str13 = oc9Var.a;
                }
                if (str13 != null) {
                    str10 = str13;
                }
                return yae.z(str10);
            case 14:
                pc9 pc9Var = (pc9) obj;
                if (pc9Var != null) {
                    str12 = pc9Var.d;
                }
                if (str12 != null) {
                    str10 = str12;
                }
                return yae.z(new jub(str10, 0L, 6));
            case 15:
                exb exbVar = (exb) obj;
                return (wmc) exbVar.f.get(exbVar.e);
            case 16:
                a0c a0cVar = (a0c) obj;
                hk1 a2 = jdd.a(a0cVar);
                sw2 sw2Var2 = ab3.a;
                a0cVar.f(a2, ru2.c, new koa(a0cVar, null, 25));
                return pvcVar;
            case 17:
                return yae.z(sl1.i0(((wzc) obj).h, " ", null, null, null, 62));
            case 18:
                ((kb3) obj).a();
                return pvcVar;
            case 19:
                return "Unexpected end of input: yet to parse ".concat(((z68) obj).b());
            case 20:
                return new rb8((tb8) obj);
            case 21:
                return new rg3(b23.o(24.0f, 16.0f, ((fsb) obj).invoke()));
            case 22:
                kj kjVar = (kj) obj;
                int i2 = kjVar.a;
                ip8 ip8Var = ((yh8) kjVar.b).a;
                ip8Var.getClass();
                try {
                    kq8Var = ip8Var.F(i2, false);
                    ArrayList<Parcelable> a3 = yh8.a(i2, kq8Var);
                    ip8Var.U(i2, kq8Var);
                    ks3 ks3Var4 = ks3Var3;
                    if (!a3.isEmpty()) {
                        ?? arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i3 = 0;
                        for (Parcelable parcelable : a3) {
                            parcelable.getClass();
                            Parcel obtain = Parcel.obtain();
                            obtain.getClass();
                            parcelable.writeToParcel(obtain, 0);
                            int dataSize = obtain.dataSize();
                            obtain.recycle();
                            if (dataSize <= 1000000) {
                                if (!arrayList2.isEmpty() && i3 + dataSize > 1000000) {
                                    arrayList.add(arrayList2);
                                    arrayList2 = new ArrayList();
                                    i3 = 0;
                                }
                                arrayList2.add(parcelable);
                                i3 += dataSize;
                            }
                        }
                        ks3Var4 = arrayList;
                        if (!arrayList2.isEmpty()) {
                            arrayList.add(arrayList2);
                            ks3Var4 = arrayList;
                        }
                    }
                    return ks3Var4;
                } catch (Throwable th) {
                    ip8Var.U(i2, kq8Var);
                    throw th;
                }
            case 23:
                return s21.p(new StringBuilder("Unexpected end of input: yet to parse '"), ((vw8) obj).a, '\'');
            case 24:
                m19 m19Var = (m19) obj;
                q9a n = aze.n("kotlinx.serialization.Polymorphic", l19.f, new o9a[0], new cl7(m19Var, 18));
                gi1 gi1Var = m19Var.a;
                gi1Var.getClass();
                return new l32(n, gi1Var);
            case 25:
                h49 h49Var = (h49) obj;
                try {
                    z87.C(gs3.a, new g49(h49Var, null, 1));
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                return new sn0(new di2(h49Var.a, 0));
            case 26:
                ((r2d) obj).getClass();
                UUID randomUUID = UUID.randomUUID();
                randomUUID.getClass();
                String uuid = randomUUID.toString();
                uuid.getClass();
                return uuid;
            case 27:
                return Float.valueOf(((ya9) obj).a());
            case 28:
                kf9 kf9Var = (kf9) obj;
                return z1d.K(new mx(kf9Var.o(), 7), jdd.a(kf9Var), new vya(5000L, Long.MAX_VALUE), new gf9(ks3Var3, true));
            default:
                cza czaVar = ((uwa) ((MainActivity) obj).R.getValue()).c;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                        ((twa) value).getClass();
                    } while (!czaVar.l(value, new twa(false)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
