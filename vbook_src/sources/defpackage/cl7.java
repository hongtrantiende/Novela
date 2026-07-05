package defpackage;

import com.reader.android.AndroidApp;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import okhttp3.ResponseBody;
import org.mozilla.javascript.ES6Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cl7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class cl7 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cl7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        float f;
        boolean z = false;
        int i = 0;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                gia giaVar = (gia) this.b;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                hk1 a = jdd.a(giaVar);
                sw2 sw2Var = ab3.a;
                giaVar.f(a, ru2.c, new gx(giaVar, booleanValue, (m42) null, 8));
                return pvc.a;
            case 1:
                String str = (String) obj;
                str.getClass();
                List z0 = k4b.z0(str, new String[]{"-"});
                ((mu4) this.b).c(Integer.valueOf(Integer.parseInt((String) z0.get(0))), Integer.valueOf(Integer.parseInt((String) z0.get(1))), z0.get(2));
                return pvc.a;
            case 2:
                ywb ywbVar = (ywb) this.b;
                if (!((Boolean) obj).booleanValue()) {
                    ywbVar.a.setValue(Boolean.FALSE);
                }
                return pvc.a;
            case 3:
                n96 n96Var = (n96) obj;
                n96Var.getClass();
                ((cl7) this.b).invoke(n96Var);
                ln1 ln1Var = new ln1(18);
                wq7 wq7Var = new wq7();
                ln1Var.invoke(wq7Var);
                y4 y4Var = new y4(21);
                wq7 wq7Var2 = new wq7();
                y4Var.invoke(wq7Var2);
                tn4 tn4Var = new tn4(15);
                wq7 wq7Var3 = new wq7();
                tn4Var.invoke(wq7Var3);
                rg8 rg8Var = new rg8(25);
                wq7 wq7Var4 = new wq7();
                rg8Var.invoke(wq7Var4);
                j9a j9aVar = new j9a(4);
                wq7 wq7Var5 = new wq7();
                j9aVar.invoke(wq7Var5);
                dw3 dw3Var = new dw3(17);
                wq7 wq7Var6 = new wq7();
                dw3Var.invoke(wq7Var6);
                wq7 wq7Var7 = new wq7();
                yr1 yr1Var = new yr1(23);
                x3b x3bVar = oaa.E;
                l96 l96Var = l96.b;
                wq7Var7.a(new yx5(new yj0(x3bVar, cm9.a(p24.class), yr1Var, l96Var)));
                pvc pvcVar = pvc.a;
                bq2 bq2Var = new bq2(29);
                wq7 wq7Var8 = new wq7();
                bq2Var.invoke(wq7Var8);
                y4 y4Var2 = new y4(24);
                wq7 wq7Var9 = new wq7();
                y4Var2.invoke(wq7Var9);
                ln1 ln1Var2 = new ln1(8);
                wq7 wq7Var10 = new wq7();
                ln1Var2.invoke(wq7Var10);
                wq7 wq7Var11 = new wq7();
                wq7Var11.a(new yx5(new yj0(x3bVar, cm9.a(g0d.class), new zu1(11), l96Var)));
                bq2 bq2Var2 = new bq2(17);
                wq7 wq7Var12 = new wq7();
                bq2Var2.invoke(wq7Var12);
                wq7 wq7Var13 = new wq7();
                wq7Var13.a(new yx5(new yj0(x3bVar, cm9.a(fy0.class), new zu1(20), l96Var)));
                wq7Var13.a(new yx5(new yj0(x3bVar, cm9.a(nx0.class), new zu1(21), l96Var)));
                wq7 wq7Var14 = new wq7();
                wq7Var14.a(new yx5(new yj0(x3bVar, cm9.a(mq0.class), new ec7(0), l96Var)));
                n96Var.a(b00.D0(new wq7[]{wq7Var, wq7Var2, wq7Var3, wq7Var4, wq7Var5, wq7Var6, wq7Var7, wq7Var8, wq7Var9, wq7Var10, wq7Var11, wq7Var12, wq7Var13, wq7Var14}));
                return pvcVar;
            case 4:
                File file = (File) obj;
                file.getClass();
                return new st7(((m41) this.b).b, file);
            case 5:
                Throwable th = (Throwable) obj;
                ((sw7) this.b).q(null);
                return pvc.a;
            case 6:
                return ((yx7) this.b).e(((Integer) obj).intValue());
            case 7:
                ((em8) this.b).i((int) (((zy5) obj).a >> 32));
                return pvc.a;
            case 8:
                ((g08) this.b).a.setValue((j08) obj);
                return pvc.a;
            case 9:
                if (((r08) obj).b == ((ls7) this.b)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                ((ib3) obj).getClass();
                return new r6((t58) this.b, 15);
            case 11:
                hi1 hi1Var = (hi1) obj;
                hi1Var.getClass();
                List list = ((m78) this.b).b;
                list.getClass();
                hi1Var.b = list;
                return pvc.a;
            case 12:
                Throwable th2 = (Throwable) obj;
                ((ResponseBody) this.b).close();
                return pvc.a;
            case 13:
                ArrayList arrayList = ((ue8) this.b).c;
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    te8 te8Var = (te8) obj2;
                    te8Var.a.b(obj, te8Var.b);
                }
                return pvc.a;
            case 14:
                nx5 nx5Var = (nx5) obj;
                nx5Var.getClass();
                nx5Var.b.b((rh8) this.b, "paddingValues");
                return pvc.a;
            case 15:
                ((r13) obj).getClass();
                return new py5(((int) Float.intBitsToFloat((int) (((kwb) this.b).a & 4294967295L))) & 4294967295L);
            case 16:
                float floatValue = ((Float) obj).floatValue();
                rj8 rj8Var = ((lk8) this.b).b;
                if (rj8Var.p() != 0) {
                    f = floatValue / rj8Var.p();
                } else {
                    f = nae.e;
                }
                rj8Var.q.i(rj8Var.j(rj8Var.k() + k27.A(f)));
                return pvc.a;
            case 17:
                o9a o9aVar = (o9a) this.b;
                int intValue = ((Integer) obj).intValue();
                return o9aVar.g(intValue) + ": " + o9aVar.i(intValue).a();
            case 18:
                hi1 hi1Var2 = (hi1) obj;
                hi1Var2.getClass();
                hi1Var2.a("type", c4b.b);
                hi1Var2.a(ES6Iterator.VALUE_PROPERTY, aze.o("kotlinx.serialization.Polymorphic<" + ((m19) this.b).a.g() + '>', s9a.f, new o9a[0]));
                hi1Var2.b = ks3.a;
                return pvc.a;
            case 19:
                n89 n89Var = (n89) obj;
                n89Var.getClass();
                return "<" + ((LinkedHashMap) this.b).get(n89Var.b) + ":" + n89Var.a + " />";
            case 20:
                qd6 qd6Var = (qd6) obj;
                float a2 = ((ya9) this.b).a();
                if (a2 > 1.0f) {
                    float f2 = (-(a2 - 1.0f)) * 180.0f;
                    long b1 = qd6Var.a.b1();
                    ij1 ij1Var = qd6Var.a.b;
                    long G = ij1Var.G();
                    ij1Var.w().i();
                    try {
                        ((mu9) ij1Var.b).z(f2, b1);
                        qd6Var.a();
                    } finally {
                        rs8.r(ij1Var, G);
                    }
                } else {
                    qd6Var.a();
                }
                return pvc.a;
            case 21:
                mc9 mc9Var = (mc9) this.b;
                List list2 = (List) obj;
                list2.getClass();
                hk1 a3 = jdd.a(mc9Var);
                sw2 sw2Var2 = ab3.a;
                mc9Var.f(a3, ru2.c, new z38(mc9Var, list2, null, 9));
                return pvc.a;
            case 22:
                pvc pvcVar2 = pvc.a;
                AndroidApp androidApp = (AndroidApp) this.b;
                n96 n96Var2 = (n96) obj;
                n96Var2.getClass();
                m96 m96Var = n96Var2.a;
                zj1 zj1Var = m96Var.a;
                ul6 ul6Var = ul6.b;
                zj1Var.getClass();
                ul6 ul6Var2 = ul6.e;
                if (ul6Var2.compareTo(ul6Var) <= 0) {
                    m96Var.a.getClass();
                    ul6Var2.compareTo(ul6Var);
                }
                fo4 fo4Var = new fo4(androidApp, 12);
                wq7 wq7Var15 = new wq7();
                fo4Var.invoke(wq7Var15);
                m96Var.b(tl1.A(wq7Var15), true);
                wq7 wq7Var16 = new wq7();
                wq7Var16.a(new yx5(new yj0(oaa.E, cm9.a(djb.class), new zcb(6), l96.a)));
                n96Var2.a(tl1.A(wq7Var16));
                return pvcVar2;
            case 23:
                ((ux1) this.b).d(obj);
                return pvc.a;
            case 24:
                kk9 kk9Var = (kk9) this.b;
                Throwable th3 = (Throwable) obj;
                CancellationException b = nye.b("Recomposer effect job completed", th3);
                synchronized (kk9Var.d) {
                    try {
                        w26 w26Var = kk9Var.e;
                        if (w26Var != null) {
                            cza czaVar = kk9Var.v;
                            ik9 ik9Var = ik9.b;
                            czaVar.getClass();
                            czaVar.n(null, ik9Var);
                            w26Var.cancel(b);
                            kk9Var.s = null;
                            w26Var.invokeOnCompletion(new fl7(27, kk9Var, th3));
                        } else {
                            kk9Var.f = b;
                            cza czaVar2 = kk9Var.v;
                            ik9 ik9Var2 = ik9.a;
                            czaVar2.getClass();
                            czaVar2.n(null, ik9Var2);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return pvc.a;
            case 25:
                ((nk9) this.b).a((un3) obj);
                return pvc.a;
            case 26:
                l8a l8aVar = (l8a) obj;
                l8aVar.getClass();
                j8a.e(l8aVar, ((c81) this.b).i);
                return pvc.a;
            case 27:
                it4 it4Var = (it4) obj;
                it4Var.getClass();
                ((cu9) this.b).g = it4Var;
                return pvc.a;
            case 28:
                ((fp8) obj).M(((ix9) this.b).a);
                return pvc.a;
            default:
                xx9 xx9Var = ((tx9) this.b).c;
                if (xx9Var != null) {
                    z2 = xx9Var.c(obj);
                }
                return Boolean.valueOf(z2);
        }
    }

    public /* synthetic */ cl7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
