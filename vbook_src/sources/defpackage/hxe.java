package defpackage;

import android.content.Context;
import android.text.InputFilter;
import android.view.KeyEvent;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hxe  reason: default package */
/* loaded from: classes.dex */
public abstract class hxe {
    public static final tu1 a = new tu1(new iv1(12), false, 766434404);
    public static final tu1 b = new tu1(new iv1(14), false, 1529166913);
    public static final tu1 c = new tu1(new jv1(5), false, 536988221);
    public static final tu1 d = new tu1(new jv1(7), false, -446463357);
    public static final double[][] e = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
    public static final double[][] f = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
    public static final double[] g = {0.2126d, 0.7152d, 0.0722d};
    public static final double[] h = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};
    public static rz6 i;

    public static final void A(b8a b8aVar, int i2, u1a u1aVar) {
        b8a b8aVar2;
        gw7 gw7Var = new gw7(new b8a[16], 0);
        List i3 = b8aVar.i(false, false);
        while (true) {
            gw7Var.d(gw7Var.c, i3);
            while (true) {
                int i4 = gw7Var.c;
                if (i4 != 0) {
                    b8aVar2 = (b8a) gw7Var.k(i4 - 1);
                    boolean o = bue.o(b8aVar2);
                    u7a u7aVar = b8aVar2.d;
                    tv7 tv7Var = u7aVar.a;
                    if (!o && !tv7Var.c(h8a.j)) {
                        i38 d2 = b8aVar2.d();
                        if (d2 != null) {
                            uy5 t = pc2.t(obe.q(d2, true));
                            if (t.f()) {
                                continue;
                            } else {
                                Object g2 = u7aVar.a.g(s7a.e);
                                s1a s1aVar = null;
                                if (g2 == null) {
                                    g2 = null;
                                }
                                lu4 lu4Var = (lu4) g2;
                                Object g3 = tv7Var.g(h8a.w);
                                if (g3 != null) {
                                    s1aVar = g3;
                                }
                                s1a s1aVar2 = s1aVar;
                                if (lu4Var != null && s1aVar2 != null && ((Number) s1aVar2.b.invoke()).floatValue() > nae.e) {
                                    int i5 = 1 + i2;
                                    u1aVar.invoke(new v1a(b8aVar2, i5, t, d2));
                                    A(b8aVar2, i5, u1aVar);
                                }
                            }
                        } else {
                            throw a82.f("Expected semantics node to have a coordinator.");
                        }
                    }
                } else {
                    return;
                }
            }
            i3 = b8aVar2.i(false, false);
        }
    }

    public static final void a(kj6 kj6Var, vt4 vt4Var, vt4 vt4Var2, boolean z, vt4 vt4Var3, vt4 vt4Var4, float f2, xt4 xt4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        vt4Var.getClass();
        vt4Var2.getClass();
        vt4Var3.getClass();
        vt4Var4.getClass();
        xt4Var.getClass();
        rv4Var.g0(-981596975);
        if (rv4Var.f(kj6Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i2 | i3;
        if (rv4Var.g(z)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i10 = i9 | i4;
        if (rv4Var.h(vt4Var3)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i11 = i10 | i5;
        if (rv4Var.h(vt4Var4)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i12 = i11 | i6;
        if (rv4Var.c(f2)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i13 = i12 | i7;
        if (rv4Var.h(xt4Var)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i14 = i13 | i8;
        boolean z8 = false;
        if ((4793491 & i14) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i14 & 1, z2)) {
            float L0 = ((r13) rv4Var.j(dy1.h)).L0(80.0f);
            Boolean valueOf = Boolean.valueOf(z);
            if ((i14 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i14 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean c2 = z4 | z3 | rv4Var.c(L0);
            if ((57344 & i14) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z9 = c2 | z5;
            if ((458752 & i14) == 131072) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z10 = z9 | z6;
            if ((3670016 & i14) == 1048576) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z11 = z10 | z7;
            if ((i14 & 29360128) == 8388608) {
                z8 = true;
            }
            boolean z12 = z11 | z8;
            Object P = rv4Var.P();
            if (z12 || P == ax1.a) {
                P = new ia0(z, vt4Var, kj6Var, L0, vt4Var3, vt4Var4, vt4Var2, f2, xt4Var, null);
                rv4Var.o0(P);
            }
            yte.g((lu4) P, rv4Var, valueOf);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new za4(kj6Var, vt4Var, vt4Var2, z, vt4Var3, vt4Var4, f2, xt4Var, i2);
        }
    }

    public static final void b(rhb rhbVar, bkd bkdVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        rv4Var.g0(525448402);
        if (rv4Var.f(rhbVar)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (rv4Var.f(bkdVar)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(xt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if (rv4Var.h(xt4Var2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i10 = i9 | i6;
        boolean z3 = true;
        if ((i10 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i10 & 1, z)) {
            boolean f2 = rv4Var.f(rhbVar.i);
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (f2 || P == obj) {
                P = yae.z(rhbVar.i);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            qg6 a2 = tg6.a(0, 3, rv4Var);
            boolean f3 = rv4Var.f(aw7Var);
            Object P2 = rv4Var.P();
            if (f3 || P2 == obj) {
                P2 = new rr3(aw7Var, null, 1);
                rv4Var.o0(P2);
            }
            qo9 o = rqe.o(a2, bkdVar, (nu4) P2, rv4Var, i10 & Token.ASSIGN_MOD);
            f25 f25Var = new f25(320.0f);
            hz hzVar = new hz(8.0f, true, new vs(2));
            hz hzVar2 = new hz(8.0f, true, new vs(2));
            boolean f4 = rv4Var.f(aw7Var) | rv4Var.f(o);
            if ((i10 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = f4 | z2;
            if ((57344 & i10) != 16384) {
                z3 = false;
            }
            boolean z5 = z4 | z3;
            Object P3 = rv4Var.P();
            if (z5 || P3 == obj) {
                Object lr3Var = new lr3(aw7Var, o, xt4Var, xt4Var2, 1);
                rv4Var.o0(lr3Var);
                P3 = lr3Var;
            }
            ade.e(f25Var, nq7Var, a2, bkdVar, hzVar, hzVar2, null, false, null, (xt4) P3, rv4Var, 1769520 | ((i10 << 6) & 7168), 0, 912);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new wp0(rhbVar, bkdVar, nq7Var, xt4Var, xt4Var2, i2, 25);
        }
    }

    public static final void c(int i2, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i3;
        int i4;
        boolean z;
        nq7 nq7Var2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1672050687);
        if (rv4Var.f(nq7Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (rv4Var2.h(vt4Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i6 & 1, z)) {
            nq7 y = zbe.y(nq7Var, 24.0f);
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, y);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            cvb.c(yqe.A((y3b) z1b.A.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.f, rv4Var2, 0, 0, 130046);
            rv4Var2 = rv4Var2;
            xbe.i(rv4Var2, pna.h(kq7.a, 24.0f));
            nq7Var2 = nq7Var;
            z1d.f(rp5.c((wk3) jk3.a.getValue(), rv4Var2, 0), yqe.A((y3b) v1b.f.getValue(), rv4Var2), false, null, null, null, null, null, vt4Var, rv4Var2, (i6 << 21) & 234881024, 252);
            rv4Var2.q(true);
        } else {
            nq7Var2 = nq7Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new u81(nq7Var2, vt4Var, i2, 10);
        }
    }

    public static final void d(cz7 cz7Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(759178935);
        if (rv4Var.f(cz7Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                vhb vhbVar = (vhb) ((fdd) voe.z(cm9.a(vhb.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z2 = jsc.z(vhbVar.f, rv4Var);
                boolean f2 = rv4Var.f(vhbVar);
                Object P = rv4Var.P();
                Object obj = ax1.a;
                if (f2 || P == obj) {
                    P = new ahb(vhbVar, null, 0);
                    rv4Var.o0(P);
                }
                yte.g((lu4) P, rv4Var, pvc.a);
                boolean f3 = rv4Var.f(vhbVar);
                Object P2 = rv4Var.P();
                if (f3 || P2 == obj) {
                    P2 = new ygb(vhbVar, 0);
                    rv4Var.o0(P2);
                }
                kd4 u = w92.u(yu8.a, (xt4) P2, rv4Var, 6);
                fxe.h(yqe.A((y3b) z1b.y.getValue(), rv4Var), pna.c, false, jce.E(-1938297549, new ri9(cz7Var, 14), rv4Var), jce.E(-1832164516, new em7(10, vhbVar, z2), rv4Var), jce.E(-2061229448, new t81(6, z2, u), rv4Var), jce.E(956759938, new cs1(15, u, vhbVar, z2), rv4Var), rv4Var, 1797168, 4);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new ri9(cz7Var, i2, 15);
        }
    }

    public static boolean e(double d2, double d3, double d4) {
        if (((d3 - d2) + 25.132741228718345d) % 6.283185307179586d < ((d4 - d2) + 25.132741228718345d) % 6.283185307179586d) {
            return true;
        }
        return false;
    }

    public static final vk8 f(ml5 ml5Var, Context context, int i2) {
        if (ml5Var instanceof ql0) {
            return aze.a(new jj(((ql0) ml5Var).a), i2);
        }
        if (ml5Var instanceof sk3) {
            return new uk3(aye.c(ml5Var, context.getResources()).mutate());
        }
        return new qo5(ml5Var);
    }

    public static final o9a g(o9a o9aVar, wf2 wf2Var) {
        o9a g2;
        s76 g3;
        o9aVar.getClass();
        wf2Var.getClass();
        if (c16.i(o9aVar.e(), s9a.f)) {
            gi1 m = bze.m(o9aVar);
            o9a o9aVar2 = null;
            if (m != null && (g3 = wf2.g(wf2Var, m)) != null) {
                o9aVar2 = g3.e();
            }
            if (o9aVar2 != null && (g2 = g(o9aVar2, wf2Var)) != null) {
                return g2;
            }
            return o9aVar;
        } else if (o9aVar.isInline()) {
            return g(o9aVar.i(0), wf2Var);
        } else {
            return o9aVar;
        }
    }

    public static double h(double d2) {
        int i2;
        double pow = Math.pow(Math.abs(d2), 0.42d);
        int i3 = (d2 > 0.0d ? 1 : (d2 == 0.0d ? 0 : -1));
        if (i3 < 0) {
            i2 = -1;
        } else if (i3 == 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        return ((i2 * 400.0d) * pow) / (pow + 27.13d);
    }

    public static oo1 i(xt4... xt4VarArr) {
        if (xt4VarArr.length > 0) {
            return new oo1(xt4VarArr, 1);
        }
        vs.m("Failed requirement.");
        return null;
    }

    public static int j(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            if (comparable2 == null) {
                return 0;
            }
            return -1;
        } else if (comparable2 == null) {
            return 1;
        } else {
            return comparable.compareTo(comparable2);
        }
    }

    public static sqa k(rj8 rj8Var, kj8 kj8Var, pq2 pq2Var, gxa gxaVar, rv4 rv4Var, int i2, int i3) {
        boolean z;
        Object obj = kj8Var;
        if ((i3 & 2) != 0) {
            obj = new Object();
        }
        if ((i3 & 4) != 0) {
            pq2Var = axa.a(rv4Var);
        }
        boolean z2 = true;
        if ((i3 & 8) != 0) {
            rk9 rk9Var = qed.a;
            gxaVar = tte.v(nae.e, 400.0f, 1, Float.valueOf(1.0f));
        }
        r13 r13Var = (r13) rv4Var.j(dy1.h);
        tc6 tc6Var = (tc6) rv4Var.j(dy1.n);
        if ((((i2 & 14) ^ 6) > 4 && rv4Var.f(rj8Var)) || (i2 & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        boolean f2 = z | rv4Var.f(pq2Var) | rv4Var.f(gxaVar);
        if ((((i2 & Token.ASSIGN_MOD) ^ 48) <= 32 || !rv4Var.f(obj)) && (i2 & 48) != 32) {
            z2 = false;
        }
        boolean f3 = f2 | z2 | rv4Var.f(r13Var) | rv4Var.d(tc6Var.ordinal());
        Object P = rv4Var.P();
        if (f3 || P == ax1.a) {
            sqa sqaVar = new sqa(new zg4(21, rj8Var, new em7(3, rj8Var, tc6Var), obj), pq2Var, gxaVar);
            rv4Var.o0(sqaVar);
            P = sqaVar;
        }
        return (sqa) P;
    }

    public static rz6 m() {
        rz6 r0fVar;
        if (i == null) {
            bw9 c2 = sw6.c();
            if (c2 != null) {
                r0fVar = c2.a();
                if (c2 instanceof w7b) {
                    op9.d("Temporary mdcAdapter given by SubstituteServiceProvider.");
                    op9.d("This mdcAdapter will be replaced after backend initialization has completed.");
                }
            } else {
                op9.a("Failed to find provider.");
                op9.a("Defaulting to no-operation MDCAdapter implementation.");
                r0fVar = new r0f(29);
            }
            i = r0fVar;
        }
        return i;
    }

    public static double n(double[] dArr) {
        double d2 = dArr[0];
        double[][] dArr2 = e;
        double[] dArr3 = dArr2[0];
        double d3 = dArr[1];
        double d4 = dArr3[1] * d3;
        double d5 = dArr[2];
        double d6 = (dArr3[2] * d5) + d4 + (dArr3[0] * d2);
        double[] dArr4 = dArr2[1];
        double d7 = (dArr4[2] * d5) + (dArr4[1] * d3) + (dArr4[0] * d2);
        double[] dArr5 = dArr2[2];
        double d8 = d3 * dArr5[1];
        double d9 = d5 * dArr5[2];
        double h2 = h(d6);
        double h3 = h(d7);
        double h4 = h(d9 + d8 + (d2 * dArr5[0]));
        double d10 = (-12.0d) * h3;
        return Math.atan2(nk2.b(h4, 2.0d, h2 + h3, 9.0d), ((d10 + (h2 * 11.0d)) + h4) / 11.0d);
    }

    public static double o(double d2) {
        int i2;
        double abs = Math.abs(d2);
        double max = Math.max(0.0d, (27.13d * abs) / (400.0d - abs));
        int i3 = (d2 > 0.0d ? 1 : (d2 == 0.0d ? 0 : -1));
        if (i3 < 0) {
            i2 = -1;
        } else if (i3 == 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        return Math.pow(max, 2.380952380952381d) * i2;
    }

    public static boolean p(double d2) {
        if (0.0d <= d2 && d2 <= 100.0d) {
            return true;
        }
        return false;
    }

    public static final boolean q(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) {
            return true;
        }
        return false;
    }

    public static int r(int i2, int... iArr) {
        for (int i3 : iArr) {
            i2 = Math.max(i2, i3);
        }
        return i2;
    }

    public static Comparable s(rg3 rg3Var, rg3 rg3Var2) {
        if (rg3Var.compareTo(rg3Var2) >= 0) {
            return rg3Var;
        }
        return rg3Var2;
    }

    public static float t(float f2, float... fArr) {
        for (float f3 : fArr) {
            f2 = Math.min(f2, f3);
        }
        return f2;
    }

    public static Comparable u(rg3 rg3Var, rg3 rg3Var2) {
        if (rg3Var.compareTo(rg3Var2) <= 0) {
            return rg3Var;
        }
        return rg3Var2;
    }

    public static hw2 v(rj8 rj8Var, ff8 ff8Var, rv4 rv4Var, int i2) {
        boolean z;
        if ((((i2 & 14) ^ 6) > 4 && rv4Var.f(rj8Var)) || (i2 & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object P = rv4Var.P();
        if (z || P == ax1.a) {
            P = new hw2(rj8Var, ff8Var);
            rv4Var.o0(P);
        }
        return (hw2) P;
    }

    public static final znd y(r36 r36Var, o9a o9aVar) {
        r36Var.getClass();
        o9aVar.getClass();
        bze e2 = o9aVar.e();
        if (e2 instanceof l19) {
            return znd.f;
        }
        boolean i2 = c16.i(e2, a5b.g);
        znd zndVar = znd.d;
        if (i2) {
            return zndVar;
        }
        if (c16.i(e2, a5b.h)) {
            o9a g2 = g(o9aVar.i(0), r36Var.b);
            bze e3 = g2.e();
            if (!(e3 instanceof w59) && !c16.i(e3, t9a.f)) {
                if (r36Var.a.d) {
                    return zndVar;
                }
                throw am8.d(g2);
            }
            return znd.e;
        }
        return znd.c;
    }

    public static double z(double d2) {
        double pow;
        double d3 = d2 / 100.0d;
        if (d3 <= 0.0031308d) {
            pow = d3 * 12.92d;
        } else {
            pow = (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d;
        }
        return pow * 255.0d;
    }

    public abstract InputFilter[] l(InputFilter[] inputFilterArr);

    public abstract void w(boolean z);

    public abstract void x(boolean z);
}
