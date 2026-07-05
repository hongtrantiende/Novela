package defpackage;

import android.net.Uri;
import android.os.Build;
import android.view.KeyEvent;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fxe  reason: default package */
/* loaded from: classes.dex */
public abstract class fxe {
    public static final tu1 a = new tu1(new iv1(11), false, 955368245);
    public static final tu1 b = new tu1(new iv1(13), false, -498098222);
    public static final tu1 c = new tu1(new jv1(4), false, -499081522);
    public static final tu1 d = new tu1(new jv1(6), false, -703242860);
    public static final double[][] e = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
    public static final double[][] f = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
    public static final double[] g = {0.2126d, 0.7152d, 0.0722d};
    public static final double[] h = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};

    public static final nq7 A(nq7 nq7Var) {
        if (Build.VERSION.SDK_INT < 29) {
            return nq7Var;
        }
        return nq7Var.a0(new ly3(null));
    }

    public static final nq7 B(nq7 nq7Var, xt4 xt4Var) {
        if (Build.VERSION.SDK_INT < 29) {
            return nq7Var;
        }
        return nq7Var.a0(new ly3(xt4Var));
    }

    public static int C(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & 65535;
        }
        return ((int[]) obj)[i];
    }

    public static void D(int i, Object obj, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static final w18 E(byte[] bArr) {
        bArr.getClass();
        if (Build.VERSION.SDK_INT >= 28 && bArr.length != 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                int readInt = objectInputStream.readInt();
                int[] iArr = new int[readInt];
                for (int i = 0; i < readInt; i++) {
                    iArr[i] = objectInputStream.readInt();
                }
                int readInt2 = objectInputStream.readInt();
                int[] iArr2 = new int[readInt2];
                for (int i2 = 0; i2 < readInt2; i2++) {
                    iArr2[i2] = objectInputStream.readInt();
                }
                w18 j = ru.j(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return j;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    bue.d(byteArrayInputStream, th);
                    throw th2;
                }
            }
        }
        return new w18(null);
    }

    public static final nq7 F(nq7 nq7Var, boolean z, bgc bgcVar, rv4 rv4Var) {
        float a2;
        long j = ((h27) rv4Var.j(j27.a)).a.p;
        if (z) {
            a2 = 1.0f;
        } else {
            a2 = bgcVar.e().a();
        }
        return nmd.u(nq7Var, ox9.C(new yk8[]{new yk8(Float.valueOf((float) nae.e), new zl1(zl1.b(a2 * 1.0f, j))), new yk8(Float.valueOf(0.6f), new zl1(zl1.b(a2 * 0.9f, j))), new yk8(Float.valueOf(1.0f), new zl1(zl1.h))}));
    }

    public static double G(double d2) {
        double pow;
        double d3 = d2 / 100.0d;
        if (d3 <= 0.0031308d) {
            pow = d3 * 12.92d;
        } else {
            pow = (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d;
        }
        return pow * 255.0d;
    }

    public static final void a(final boolean z, final boolean z2, final float f2, final nq7 nq7Var, final xt4 xt4Var, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        rv4Var.g0(-1012829846);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i10 = i | i2;
        if (rv4Var.g(z2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i11 = i10 | i3;
        if (rv4Var.c(f2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i12 = i11 | i4;
        if (rv4Var.f(nq7Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i13 = i12 | i5;
        if (rv4Var.h(xt4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i14 = i13 | i6;
        if (rv4Var.h(vt4Var)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i15 = i14 | i7;
        if (rv4Var.h(vt4Var2)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i16 = i15 | i8;
        if (rv4Var.h(vt4Var3)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i17 = i16 | i9;
        if ((4793491 & i17) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i17 & 1, z3)) {
            eu3 g2 = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new y4(7);
                rv4Var.o0(P);
            }
            eu3 a2 = g2.a(zt3.t((xt4) P));
            lz3 i18 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new y4(7);
                rv4Var.o0(P2);
            }
            rte.c(z, nq7Var, a2, i18.a(zt3.x((xt4) P2)), null, jce.E(-1392577646, new s90(z2, vt4Var2, vt4Var, f2, vt4Var3, xt4Var), rv4Var), rv4Var, (i17 & 14) | 200064 | ((i17 >> 6) & Token.ASSIGN_MOD), 16);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(z, z2, f2, nq7Var, xt4Var, vt4Var, vt4Var2, vt4Var3, i) { // from class: t90
                public final /* synthetic */ vt4 C;
                public final /* synthetic */ vt4 D;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ float c;
                public final /* synthetic */ nq7 d;
                public final /* synthetic */ xt4 e;
                public final /* synthetic */ vt4 f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(1);
                    fxe.a(this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    public static final void b(vp3 vp3Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        rv4Var.g0(-1750618746);
        if (rv4Var.f(vp3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            do5.a(vp3Var.c, r0f.e, false, null, null, hse.d, nq7Var, null, rv4Var, ((i5 << 18) & 29360128) | 1572912, 828);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ah7(vp3Var, nq7Var, i, 28);
        }
    }

    public static final void c(int i, vt4 vt4Var, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var, rh8 rh8Var) {
        boolean z;
        xt4 xt4Var2;
        rh8 rh8Var2;
        pb2 pb2Var;
        kj6 kj6Var;
        aw7 aw7Var;
        yya yyaVar;
        boolean z2;
        xt4 hm0Var;
        lh9 lh9Var;
        boolean z3;
        aw7 aw7Var2;
        as3 as3Var;
        qg6 qg6Var;
        boolean z4;
        int i2;
        int i3;
        int i4;
        rv4 rv4Var2 = rv4Var;
        xt4Var.getClass();
        vt4Var.getClass();
        rv4Var2.g0(-1083503617);
        int i5 = i | 6;
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i5 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i5 |= i3;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i2 = 2048;
            } else {
                i2 = 1024;
            }
            i5 |= i2;
        }
        if ((i5 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            rh8Var2 = new th8(nae.e, nae.e, nae.e, nae.e);
            sdd a2 = kv6.a(rv4Var2);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                as3 as3Var2 = (as3) ((fdd) voe.z(cm9.a(as3.class), a2.i(), null, pb2Var, o96.a(rv4Var2), null));
                aw7 z5 = jsc.z(as3Var2.d, rv4Var2);
                kj6 a3 = mj6.a(0, rv4Var2, 0, 3);
                qg6 a4 = tg6.a(0, 3, rv4Var2);
                Object P = rv4Var2.P();
                lh9 lh9Var2 = ax1.a;
                if (P == lh9Var2) {
                    P = yae.z(ks3.a);
                    rv4Var2.o0(P);
                }
                aw7 aw7Var3 = (aw7) P;
                Integer valueOf = Integer.valueOf(((tr3) z5.getValue()).b.size());
                List list = ((tr3) z5.getValue()).c;
                boolean f2 = rv4Var2.f(z5);
                Object P2 = rv4Var2.P();
                if (f2 || P2 == lh9Var2) {
                    P2 = new pq3(z5, aw7Var3, null);
                    rv4Var2.o0(P2);
                }
                yte.h(valueOf, list, (lu4) P2, rv4Var2);
                Object P3 = rv4Var2.P();
                if (P3 == lh9Var2) {
                    P3 = yae.q(new u93(6, a4, aw7Var3));
                    rv4Var2.o0(P3);
                }
                yya yyaVar2 = (yya) P3;
                String str = (String) yyaVar2.getValue();
                boolean f3 = rv4Var2.f(z5) | rv4Var2.f(a3);
                Object P4 = rv4Var2.P();
                if (!f3 && P4 != lh9Var2) {
                    aw7Var = z5;
                    kj6Var = a3;
                    yyaVar = yyaVar2;
                } else {
                    kj6Var = a3;
                    P4 = new uw2(kj6Var, z5, yyaVar2, null, 8);
                    aw7Var = z5;
                    yyaVar = yyaVar2;
                    rv4Var2.o0(P4);
                }
                yte.g((lu4) P4, rv4Var2, str);
                Object P5 = rv4Var2.P();
                if (P5 == lh9Var2) {
                    P5 = yte.s(rv4Var2);
                    rv4Var2.o0(P5);
                }
                m82 m82Var = (m82) P5;
                xn1 a5 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
                int hashCode = Long.hashCode(rv4Var2.T);
                xt8 l = rv4Var2.l();
                nq7 p = lye.p(rv4Var, nq7Var);
                rw1.k.getClass();
                zx1 zx1Var = qw1.b;
                rv4Var2.i0();
                if (rv4Var2.S) {
                    rv4Var2.k(zx1Var);
                } else {
                    rv4Var2.r0();
                }
                jce.F(qw1.f, rv4Var2, a5);
                jce.F(qw1.e, rv4Var2, l);
                jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                jce.C(qw1.h, rv4Var2);
                jce.F(qw1.d, rv4Var2, p);
                nq7 h2 = pna.h(pna.f(kq7.a, 1.0f), 46.0f);
                th8 h3 = zbe.h(2, 8.0f);
                boolean f4 = rv4Var2.f(aw7Var) | rv4Var2.h(m82Var) | rv4Var2.f(a4);
                if ((i5 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z6 = f4 | z2;
                Object P6 = rv4Var2.P();
                if (!z6 && P6 != lh9Var2) {
                    hm0Var = P6;
                    qg6Var = a4;
                    lh9Var = lh9Var2;
                    z3 = true;
                    aw7Var2 = aw7Var;
                    as3Var = as3Var2;
                } else {
                    lh9Var = lh9Var2;
                    z3 = true;
                    aw7Var2 = aw7Var;
                    as3Var = as3Var2;
                    hm0Var = new hm0(aw7Var2, m82Var, a4, yyaVar, aw7Var3, vt4Var, 5);
                    qg6Var = a4;
                    rv4Var2.o0(hm0Var);
                }
                lh9 lh9Var3 = lh9Var;
                aw7 aw7Var4 = aw7Var2;
                as3 as3Var3 = as3Var;
                boolean z7 = z3;
                jce.e(h2, kj6Var, h3, false, null, null, null, false, null, hm0Var, rv4Var2, 390, 504);
                we6 we6Var = new we6(1.0f, z7);
                f25 f25Var = new f25(58.0f);
                bkd r = mwe.r(rh8Var2, new th8(8.0f, 8.0f, 8.0f, 8.0f));
                boolean f5 = rv4Var2.f(aw7Var4);
                if ((i5 & 896) == 256) {
                    z4 = z7;
                } else {
                    z4 = false;
                }
                boolean f6 = f5 | z4 | rv4Var2.f(as3Var3);
                Object P7 = rv4Var2.P();
                if (!f6 && P7 != lh9Var3) {
                    xt4Var2 = xt4Var;
                } else {
                    xt4Var2 = xt4Var;
                    P7 = new nq3(0, aw7Var4, xt4Var2, as3Var3);
                    rv4Var2.o0(P7);
                }
                ade.e(f25Var, we6Var, qg6Var, r, null, null, null, false, null, (xt4) P7, rv4Var2, 0, 0, 1008);
                rv4Var2 = rv4Var2;
                rv4Var2.q(z7);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            xt4Var2 = xt4Var;
            rv4Var2.X();
            rh8Var2 = rh8Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new td1(rh8Var2, nq7Var, xt4Var2, vt4Var, i);
        }
    }

    public static final void d(int i, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, vt4 vt4Var5, vt4 vt4Var6, vt4 vt4Var7, vt4 vt4Var8, vt4 vt4Var9, vt4 vt4Var10, vt4 vt4Var11, xt4 xt4Var, rv4 rv4Var, rl5 rl5Var, am5 am5Var, dm5 dm5Var, xp5 xp5Var, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        char c2;
        char c3;
        int i11;
        int i12;
        int i13;
        boolean z2;
        rl5Var.getClass();
        am5Var.getClass();
        xp5Var.getClass();
        dm5Var.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        vt4Var3.getClass();
        vt4Var4.getClass();
        vt4Var5.getClass();
        vt4Var6.getClass();
        vt4Var7.getClass();
        vt4Var8.getClass();
        vt4Var9.getClass();
        vt4Var10.getClass();
        vt4Var11.getClass();
        xt4Var.getClass();
        rv4Var.g0(-1093457760);
        if (rv4Var.g(z)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i14 = i | i2;
        if (rv4Var.f(rl5Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i15 = i14 | i3;
        if (rv4Var.f(am5Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i16 = i15 | i4;
        if (rv4Var.f(xp5Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i17 = i16 | i5;
        char c4 = 0;
        if (rv4Var.f(dm5Var)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i18 = i17 | i6;
        char c5 = 0;
        if (rv4Var.h(vt4Var)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i19 = i18 | i7;
        char c6 = 0;
        if (rv4Var.h(vt4Var2)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i20 = i19 | i8;
        if (rv4Var.h(vt4Var3)) {
            i9 = 67108864;
        } else {
            i9 = 33554432;
        }
        int i21 = i20 | i9;
        if (rv4Var.h(vt4Var4)) {
            i10 = 536870912;
        } else {
            i10 = 268435456;
        }
        int i22 = i21 | i10;
        if (rv4Var.h(vt4Var5)) {
            c2 = 4;
        } else {
            c2 = 2;
        }
        if (rv4Var.h(vt4Var6)) {
            c3 = ' ';
        } else {
            c3 = 16;
        }
        int i23 = c2 | c3;
        if (rv4Var.h(vt4Var7)) {
            i11 = 256;
        } else {
            i11 = Token.CASE;
        }
        int i24 = i23 | i11;
        if (rv4Var.h(vt4Var8)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i25 = i24 | i12;
        if (rv4Var.h(vt4Var9)) {
            i13 = 16384;
        } else {
            i13 = 8192;
        }
        int i26 = i25 | i13;
        if (!rv4Var.h(vt4Var10)) {
            c4 = 0;
        }
        int i27 = i26 | c4;
        if (rv4Var.h(vt4Var11)) {
            c5 = 0;
        }
        int i28 = i27 | c5;
        if (rv4Var.h(xt4Var)) {
            c6 = 0;
        }
        int i29 = i28 | c6;
        if ((i22 & 306783379) == 306783378 && (4793491 & i29) == 4793490) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i22 & 1, z2)) {
            if (ikd.a(rv4Var)) {
                rv4Var.e0(2127449083);
                e(i22 & 2147483646, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var7, vt4Var8, vt4Var9, vt4Var10, vt4Var11, xt4Var, rv4Var, rl5Var, am5Var, dm5Var, xp5Var, z);
                rv4Var.q(false);
            } else {
                rv4Var.e0(2128223835);
                f(i22 & 2147483646, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var7, vt4Var8, vt4Var9, vt4Var10, vt4Var11, xt4Var, rv4Var, rl5Var, am5Var, dm5Var, xp5Var, z);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new no5(z, rl5Var, am5Var, xp5Var, dm5Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var7, vt4Var8, vt4Var9, vt4Var10, vt4Var11, xt4Var, i, 0);
        }
    }

    public static final void e(int i, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, vt4 vt4Var5, vt4 vt4Var6, vt4 vt4Var7, vt4 vt4Var8, vt4 vt4Var9, vt4 vt4Var10, vt4 vt4Var11, xt4 xt4Var, rv4 rv4Var, rl5 rl5Var, am5 am5Var, dm5 dm5Var, xp5 xp5Var, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        rv4Var.g0(-596441090);
        if (rv4Var.g(z)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i15 = i | i2;
        if (rv4Var.f(rl5Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i16 = i15 | i3;
        if (rv4Var.f(am5Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i17 = i16 | i4;
        if (rv4Var.f(xp5Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i18 = i17 | i5;
        boolean f2 = rv4Var.f(dm5Var);
        int i19 = Parser.ARGC_LIMIT;
        if (f2) {
            i6 = 131072;
        } else {
            i6 = 65536;
        }
        int i20 = i18 | i6;
        int i21 = 524288;
        if (rv4Var.h(vt4Var)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i22 = i20 | i7;
        int i23 = 4194304;
        if (rv4Var.h(vt4Var2)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i24 = i22 | i8;
        if (rv4Var.h(vt4Var3)) {
            i9 = 67108864;
        } else {
            i9 = 33554432;
        }
        int i25 = i24 | i9;
        if (rv4Var.h(vt4Var4)) {
            i10 = 536870912;
        } else {
            i10 = 268435456;
        }
        int i26 = i25 | i10;
        if (rv4Var.h(vt4Var5)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i27 = 8192;
        if (rv4Var.h(vt4Var6)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i28 = i11 | i12;
        if (rv4Var.h(vt4Var7)) {
            i13 = 256;
        } else {
            i13 = Token.CASE;
        }
        int i29 = i28 | i13;
        if (rv4Var.h(vt4Var8)) {
            i14 = 2048;
        } else {
            i14 = 1024;
        }
        int i30 = i29 | i14;
        if (rv4Var.h(vt4Var9)) {
            i27 = 16384;
        }
        int i31 = i30 | i27;
        if (rv4Var.h(vt4Var10)) {
            i19 = 131072;
        }
        int i32 = i31 | i19;
        if (rv4Var.h(vt4Var11)) {
            i21 = 1048576;
        }
        int i33 = i32 | i21;
        if (rv4Var.h(xt4Var)) {
            i23 = 8388608;
        }
        int i34 = i33 | i23;
        if ((306783379 & i26) == 306783378 && (i34 & 4793491) == 4793490) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i26 & 1, z2)) {
            String str = rl5Var.b;
            String str2 = am5Var.b;
            int i35 = xp5Var.b;
            int i36 = xp5Var.c;
            kq7 kq7Var = kq7.a;
            int i37 = (i26 >> 3) & 14;
            int i38 = i34 & Token.ASSIGN_MOD;
            xxe.h(z, str, str2, i35, i36, pna.f(kq7Var, 1.0f), vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var7, rv4Var, i37 | 196608 | (i26 & 3670016) | (i26 & 29360128) | (i26 & 234881024) | (i26 & 1879048192));
            int i39 = i34 >> 12;
            uwe.e(z, dm5Var.d, dm5Var.e, am5Var.b, am5Var.a, am5Var.c, xp5Var.b, xp5Var.c, pu0.a.a(kq7Var, kh5.D), vt4Var8, vt4Var9, vt4Var6, vt4Var10, xt4Var, vt4Var11, rv4Var, i37 | ((i34 << 18) & 1879048192), (i39 & 7168) | (i39 & 14) | i38 | ((i34 >> 9) & 896) | (57344 & (i34 >> 6)));
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new no5(z, rl5Var, am5Var, xp5Var, dm5Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var7, vt4Var8, vt4Var9, vt4Var10, vt4Var11, xt4Var, i, 2);
        }
    }

    public static final void f(int i, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, vt4 vt4Var5, vt4 vt4Var6, vt4 vt4Var7, vt4 vt4Var8, vt4 vt4Var9, vt4 vt4Var10, vt4 vt4Var11, xt4 xt4Var, rv4 rv4Var, rl5 rl5Var, am5 am5Var, dm5 dm5Var, xp5 xp5Var, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        am5 am5Var2;
        dm5 dm5Var2;
        rv4Var.g0(1840944614);
        if (rv4Var.g(z)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i15 = i | i2;
        if (rv4Var.f(rl5Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i16 = i15 | i3;
        if (rv4Var.f(am5Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i17 = i16 | i4;
        int i18 = 8192;
        if (rv4Var.f(xp5Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i19 = i17 | i5;
        boolean f2 = rv4Var.f(dm5Var);
        int i20 = Parser.ARGC_LIMIT;
        if (f2) {
            i6 = 131072;
        } else {
            i6 = 65536;
        }
        int i21 = i19 | i6;
        int i22 = 524288;
        if (rv4Var.h(vt4Var)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i23 = i21 | i7;
        int i24 = 4194304;
        if (rv4Var.h(vt4Var2)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i25 = i23 | i8;
        if (rv4Var.h(vt4Var3)) {
            i9 = 67108864;
        } else {
            i9 = 33554432;
        }
        int i26 = i25 | i9;
        if (rv4Var.h(vt4Var4)) {
            i10 = 536870912;
        } else {
            i10 = 268435456;
        }
        int i27 = i26 | i10;
        if (rv4Var.h(vt4Var5)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        if (rv4Var.h(vt4Var6)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i28 = i11 | i12;
        if (rv4Var.h(vt4Var7)) {
            i13 = 256;
        } else {
            i13 = Token.CASE;
        }
        int i29 = i28 | i13;
        if (rv4Var.h(vt4Var8)) {
            i14 = 2048;
        } else {
            i14 = 1024;
        }
        int i30 = i29 | i14;
        if (rv4Var.h(vt4Var9)) {
            i18 = 16384;
        }
        int i31 = i30 | i18;
        if (rv4Var.h(vt4Var10)) {
            i20 = 131072;
        }
        int i32 = i31 | i20;
        if (rv4Var.h(vt4Var11)) {
            i22 = 1048576;
        }
        int i33 = i32 | i22;
        if (rv4Var.h(xt4Var)) {
            i24 = 8388608;
        }
        int i34 = i33 | i24;
        if ((306783379 & i27) == 306783378 && (i34 & 4793491) == 4793490) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i27 & 1, z2)) {
            int i35 = dm5Var.d;
            String str = rl5Var.b;
            String str2 = am5Var.b;
            int i36 = xp5Var.b;
            int i37 = xp5Var.c;
            kq7 kq7Var = kq7.a;
            int i38 = (i27 >> 3) & 14;
            int i39 = i34 << 6;
            int i40 = i34 >> 12;
            xxe.i(z, str, str2, i36, i37, i35, pna.f(kq7Var, 1.0f), vt4Var, vt4Var3, vt4Var2, vt4Var11, vt4Var4, vt4Var5, xt4Var, vt4Var7, rv4Var, i38 | 1572864 | ((i27 << 3) & 29360128) | (i27 & 234881024) | ((i27 << 6) & 1879048192), ((i34 >> 18) & 14) | ((i27 >> 24) & Token.ASSIGN_MOD) | (i39 & 896) | (i40 & 7168) | (i39 & 57344));
            dm5Var2 = dm5Var;
            am5Var2 = am5Var;
            uwe.f(z, dm5Var2.e, am5Var2.a, am5Var2.c, xp5Var.b, xp5Var.c, pu0.a.a(kq7Var, kh5.D), vt4Var10, vt4Var6, vt4Var8, vt4Var9, rv4Var, i38 | (i39 & 29360128) | ((i34 << 21) & 234881024) | ((i34 << 18) & 1879048192), i40 & 14);
        } else {
            am5Var2 = am5Var;
            dm5Var2 = dm5Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new no5(z, rl5Var, am5Var2, xp5Var, dm5Var2, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var7, vt4Var8, vt4Var9, vt4Var10, vt4Var11, xt4Var, i, 1);
        }
    }

    public static final void g(tu1 tu1Var, rv4 rv4Var, int i) {
        boolean z;
        rv4Var.g0(441837433);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new Object();
                rv4Var.o0(P);
            }
            zy6 zy6Var = (zy6) P;
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = zx1.R;
                rv4Var.o0(P2);
            }
            vt4 vt4Var = (vt4) P2;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var);
            } else {
                rv4Var.r0();
            }
            if (rv4Var.S) {
                rv4Var.b(pvc.a, new tsa(21, (byte) 0));
            }
            jce.F(co5.J, rv4Var, zy6Var);
            tu1Var.c(zy6Var, rv4Var, 48);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new az6(i, 0, tu1Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(java.lang.String r21, defpackage.nq7 r22, boolean r23, defpackage.tu1 r24, defpackage.mu4 r25, defpackage.mu4 r26, defpackage.tu1 r27, defpackage.rv4 r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxe.h(java.lang.String, nq7, boolean, tu1, mu4, mu4, tu1, rv4, int, int):void");
    }

    public static final void i(nq7 nq7Var, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(-522896278);
        if (rv4Var.f(nq7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            v9b.a(nq7Var, null, zl1.h, 0L, nae.e, nae.e, null, jce.E(489587119, new x0a(tu1Var, 0), rv4Var), rv4Var, (i3 & 14) | 12583296, Token.FUNCTION);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new a62(nq7Var, tu1Var, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(java.lang.String r19, defpackage.nq7 r20, defpackage.tu1 r21, defpackage.mu4 r22, defpackage.tu1 r23, defpackage.rv4 r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxe.j(java.lang.String, nq7, tu1, mu4, tu1, rv4, int, int):void");
    }

    public static boolean k(double d2, double d3, double d4) {
        if (((d3 - d2) + 25.132741228718345d) % 6.283185307179586d < ((d4 - d2) + 25.132741228718345d) % 6.283185307179586d) {
            return true;
        }
        return false;
    }

    public static final LinkedHashSet l(byte[] bArr) {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i = 0; i < readInt; i++) {
                        Uri parse = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        parse.getClass();
                        linkedHashSet.add(new v02(readBoolean, parse));
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        bue.d(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                bue.d(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static double m(double d2) {
        int i;
        double pow = Math.pow(Math.abs(d2), 0.42d);
        int i2 = (d2 > 0.0d ? 1 : (d2 == 0.0d ? 0 : -1));
        if (i2 < 0) {
            i = -1;
        } else if (i2 == 0) {
            i = 0;
        } else {
            i = 1;
        }
        return ((i * 400.0d) * pow) / (pow + 27.13d);
    }

    public static Object n(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
        vs.m(a82.j(i, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static List o(List list, long j, long j2, float f2, boolean z, float f3) {
        long j3;
        float f4;
        float f5;
        float intBitsToFloat;
        list.getClass();
        if (j == 9205357640488583168L) {
            return ks3.a;
        }
        if (z) {
            j3 = j & 4294967295L;
        } else {
            j3 = j >> 32;
        }
        float intBitsToFloat2 = Float.intBitsToFloat((int) j3) / f2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            mi8 mi8Var = (mi8) obj;
            if (z) {
                int i = (int) (j2 & 4294967295L);
                f4 = intBitsToFloat2 * f3;
                f5 = (-Float.intBitsToFloat(i)) - f4;
                intBitsToFloat = Float.intBitsToFloat(i);
            } else {
                int i2 = (int) (j2 >> 32);
                f4 = intBitsToFloat2 * f3;
                f5 = (-Float.intBitsToFloat(i2)) - f4;
                intBitsToFloat = Float.intBitsToFloat(i2);
            }
            float f6 = (-intBitsToFloat) + intBitsToFloat2 + f4;
            if (mi8Var.c > f5 && mi8Var.b < f6) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static double p(double[] dArr) {
        dArr.getClass();
        double[] p = jye.p(dArr, e);
        double m = m(p[0]);
        double m2 = m(p[1]);
        double m3 = m(p[2]);
        return Math.atan2(nk2.b(m3, 2.0d, m + m2, 9.0d), ((((-12.0d) * m2) + (m * 11.0d)) + m3) / 11.0d);
    }

    public static final ng0 q(int i) {
        if (i != 0) {
            if (i == 1) {
                return ng0.b;
            }
            vs.m(hl5.l("Could not convert ", " to BackoffPolicy", i));
            return null;
        }
        return ng0.a;
    }

    public static final c28 r(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i == 5) {
                                return c28.f;
                            }
                            vs.m(hl5.l("Could not convert ", " to NetworkType", i));
                            return null;
                        }
                        return c28.e;
                    }
                    return c28.d;
                }
                return c28.c;
            }
            return c28.b;
        }
        return c28.a;
    }

    public static final mf8 s(int i) {
        if (i != 0) {
            if (i == 1) {
                return mf8.b;
            }
            vs.m(hl5.l("Could not convert ", " to OutOfQuotaPolicy", i));
            return null;
        }
        return mf8.a;
    }

    public static final jmd t(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return jmd.f;
                            }
                            vs.m(hl5.l("Could not convert ", " to State", i));
                            return null;
                        }
                        return jmd.e;
                    }
                    return jmd.d;
                }
                return jmd.c;
            }
            return jmd.b;
        }
        return jmd.a;
    }

    public static double u(double d2) {
        int i;
        double abs = Math.abs(d2);
        double max = Math.max(0.0d, (27.13d * abs) / (400.0d - abs));
        int i2 = (d2 > 0.0d ? 1 : (d2 == 0.0d ? 0 : -1));
        if (i2 < 0) {
            i = -1;
        } else if (i2 == 0) {
            i = 0;
        } else {
            i = 1;
        }
        return Math.pow(max, 2.380952380952381d) * i;
    }

    public static boolean v(double d2) {
        if (0.0d <= d2 && d2 <= 100.0d) {
            return true;
        }
        return false;
    }

    public static final boolean w(KeyEvent keyEvent) {
        if ((keyEvent.getFlags() & 2) == 2) {
            return true;
        }
        return false;
    }

    public static int x(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        D(r1, r12, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        r13[r5] = x(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int y(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        /*
            int r0 = defpackage.nqe.B(r9)
            r1 = r0 & r11
            int r2 = C(r1, r12)
            r3 = -1
            if (r2 != 0) goto Le
            goto L40
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = r3
        L11:
            int r2 = r2 + (-1)
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3c
            r7 = r14[r2]
            boolean r7 = defpackage.bue.g(r9, r7)
            if (r7 == 0) goto L3c
            if (r15 == 0) goto L2b
            r7 = r15[r2]
            boolean r7 = defpackage.bue.g(r10, r7)
            if (r7 == 0) goto L3c
        L2b:
            r9 = r6 & r11
            if (r5 != r3) goto L33
            D(r1, r12, r9)
            return r2
        L33:
            r10 = r13[r5]
            int r9 = x(r10, r9, r11)
            r13[r5] = r9
            return r2
        L3c:
            r5 = r6 & r11
            if (r5 != 0) goto L41
        L40:
            return r3
        L41:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxe.y(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static final int z(jmd jmdVar) {
        jmdVar.getClass();
        int ordinal = jmdVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        xk5.o();
                        return 0;
                    }
                }
            }
        }
        return i;
    }
}
