package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: owe  reason: default package */
/* loaded from: classes3.dex */
public abstract class owe {
    public static final tu1 a = new tu1(new iv1(1), false, -711113688);
    public static final tu1 b = new tu1(new iv1(2), false, -193871445);
    public static final int c = 9;
    public static final int d = 6;
    public static final int e = 10;
    public static final int f = 5;
    public static final int g = 15;

    public static final nq7 A(nq7 nq7Var, boolean z, yu7 yu7Var) {
        nq7 nq7Var2;
        if (z) {
            nq7Var2 = new ln4(yu7Var);
        } else {
            nq7Var2 = kq7.a;
        }
        return nq7Var.a0(nq7Var2);
    }

    public static final String B(long j) {
        long j2 = j / 60000;
        return (j2 / 60) + "h " + (j2 % 60) + "m";
    }

    public static ar5 C(rv4 rv4Var) {
        tza tzaVar = j27.a;
        long j = ((h27) rv4Var.j(tzaVar)).a.a;
        long j2 = ((h27) rv4Var.j(tzaVar)).a.n;
        long b2 = zl1.b(0.3f, ((h27) rv4Var.j(tzaVar)).a.c);
        boolean e2 = rv4Var.e(j) | rv4Var.e(j2) | rv4Var.e(b2);
        Object P = rv4Var.P();
        if (e2 || P == ax1.a) {
            zq5 zq5Var = new zq5(ES6Iterator.DONE_PROPERTY, 250.0f, 200.0f, 250.0f, 200.0f, 0L, 0, false, 224);
            esa esaVar = new esa(b2);
            int i = k4d.a;
            hy hyVar = new hy(2);
            hyVar.i(63.0f, 134.0f);
            hyVar.e(154.0f);
            hyVar.c(154.515f, 134.0f, 155.017f, 133.944f, 155.5f, 133.839f);
            hyVar.c(155.983f, 133.944f, 156.485f, 134.0f, 157.0f, 134.0f);
            hyVar.e(209.0f);
            hyVar.c(212.866f, 134.0f, 216.0f, 130.866f, 216.0f, 127.0f);
            hyVar.c(216.0f, 123.134f, 212.866f, 120.0f, 209.0f, 120.0f);
            hyVar.e(203.0f);
            hyVar.c(199.134f, 120.0f, 196.0f, 116.866f, 196.0f, 113.0f);
            hyVar.c(196.0f, 109.134f, 199.134f, 106.0f, 203.0f, 106.0f);
            hyVar.e(222.0f);
            hyVar.c(225.866f, 106.0f, 229.0f, 102.866f, 229.0f, 99.0f);
            hyVar.c(229.0f, 95.134f, 225.866f, 92.0f, 222.0f, 92.0f);
            hyVar.e(200.0f);
            hyVar.c(203.866f, 92.0f, 207.0f, 88.866f, 207.0f, 85.0f);
            hyVar.c(207.0f, 81.134f, 203.866f, 78.0f, 200.0f, 78.0f);
            hyVar.e(136.0f);
            hyVar.c(139.866f, 78.0f, 143.0f, 74.866f, 143.0f, 71.0f);
            hyVar.c(143.0f, 67.134f, 139.866f, 64.0f, 136.0f, 64.0f);
            hyVar.e(79.0f);
            hyVar.c(75.134f, 64.0f, 72.0f, 67.134f, 72.0f, 71.0f);
            hyVar.c(72.0f, 74.866f, 75.134f, 78.0f, 79.0f, 78.0f);
            hyVar.e(39.0f);
            hyVar.c(35.134f, 78.0f, 32.0f, 81.134f, 32.0f, 85.0f);
            hyVar.c(32.0f, 88.866f, 35.134f, 92.0f, 39.0f, 92.0f);
            hyVar.e(64.0f);
            hyVar.c(67.866f, 92.0f, 71.0f, 95.134f, 71.0f, 99.0f);
            hyVar.c(71.0f, 102.866f, 67.866f, 106.0f, 64.0f, 106.0f);
            hyVar.e(24.0f);
            hyVar.c(20.134f, 106.0f, 17.0f, 109.134f, 17.0f, 113.0f);
            hyVar.c(17.0f, 116.866f, 20.134f, 120.0f, 24.0f, 120.0f);
            hyVar.e(63.0f);
            hyVar.c(59.134f, 120.0f, 56.0f, 123.134f, 56.0f, 127.0f);
            hyVar.c(56.0f, 130.866f, 59.134f, 134.0f, 63.0f, 134.0f);
            hyVar.b();
            hyVar.i(226.0f, 134.0f);
            hyVar.c(229.866f, 134.0f, 233.0f, 130.866f, 233.0f, 127.0f);
            hyVar.c(233.0f, 123.134f, 229.866f, 120.0f, 226.0f, 120.0f);
            hyVar.c(222.134f, 120.0f, 219.0f, 123.134f, 219.0f, 127.0f);
            hyVar.c(219.0f, 130.866f, 222.134f, 134.0f, 226.0f, 134.0f);
            hyVar.b();
            zq5Var.c(1.0f, 1.0f, nae.e, 4.0f, nae.e, 1.0f, nae.e, 1, 0, 0, esaVar, null, "", hyVar.a);
            esa esaVar2 = new esa(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new rn8(172.5f, 45.0f));
            arrayList.add(new eo8(51.0f));
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 1, null, esaVar2, "", arrayList);
            esa esaVar3 = new esa(j);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new rn8(172.5f, 59.0f));
            arrayList2.add(new eo8(65.0f));
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 1, null, esaVar3, "", arrayList2);
            esa esaVar4 = new esa(j);
            ArrayList arrayList3 = new ArrayList(32);
            arrayList3.add(new rn8(162.5f, 55.0f));
            arrayList3.add(new pn8(168.5f));
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 1, null, esaVar4, "", arrayList3);
            esa esaVar5 = new esa(j);
            ArrayList arrayList4 = new ArrayList(32);
            arrayList4.add(new rn8(176.5f, 55.0f));
            arrayList4.add(new pn8(182.5f));
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 1, null, esaVar5, "", arrayList4);
            esa esaVar6 = new esa(j);
            ArrayList arrayList5 = new ArrayList(32);
            arrayList5.add(new rn8(89.5f, 148.0f));
            arrayList5.add(new eo8(152.0f));
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 1, null, esaVar6, "", arrayList5);
            esa esaVar7 = new esa(j);
            ArrayList arrayList6 = new ArrayList(32);
            arrayList6.add(new rn8(89.5f, 160.0f));
            arrayList6.add(new eo8(164.0f));
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 1, null, esaVar7, "", arrayList6);
            esa esaVar8 = new esa(j);
            ArrayList arrayList7 = new ArrayList(32);
            arrayList7.add(new rn8(81.5f, 156.0f));
            arrayList7.add(new pn8(85.5f));
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 1, null, esaVar8, "", arrayList7);
            esa esaVar9 = new esa(j);
            ArrayList arrayList8 = new ArrayList(32);
            arrayList8.add(new rn8(93.5f, 156.0f));
            arrayList8.add(new pn8(97.5f));
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 1, null, esaVar9, "", arrayList8);
            esa esaVar10 = new esa(j2);
            hy d2 = s21.d(160.711f, 131.126f);
            d2.c(162.102f, 129.423f, 163.352f, 127.642f, 164.461f, 125.799f);
            d2.c(166.901f, 121.744f, 168.66f, 117.388f, 169.734f, 112.897f);
            d2.c(170.821f, 108.356f, 171.209f, 103.676f, 170.894f, 99.0296f);
            d2.c(170.62f, 94.9756f, 169.811f, 90.9475f, 168.465f, 87.0598f);
            d2.c(167.131f, 83.2028f, 165.268f, 79.484f, 162.875f, 76.015f);
            d2.c(161.45f, 73.9479f, 159.836f, 71.9696f, 158.034f, 70.1036f);
            d2.c(155.388f, 67.364f, 152.486f, 65.0219f, 149.402f, 63.0787f);
            d2.c(146.089f, 60.9908f, 142.566f, 59.3634f, 138.926f, 58.1984f);
            d2.c(134.368f, 56.7393f, 129.628f, 56.0054f, 124.886f, 56.0f);
            d2.c(121.197f, 55.9959f, 117.507f, 56.4328f, 113.902f, 57.3125f);
            d2.c(109.845f, 58.3028f, 105.895f, 59.8543f, 102.177f, 61.9692f);
            d2.c(98.9076f, 63.8284f, 95.817f, 66.123f, 92.988f, 68.8547f);
            d2.c(89.4328f, 72.2875f, 86.553f, 76.1572f, 84.3512f, 80.2985f);
            d2.c(82.1956f, 84.3531f, 80.6899f, 88.6682f, 79.8366f, 93.0887f);
            d2.c(78.9574f, 97.6429f, 78.7706f, 102.309f, 79.2789f, 106.918f);
            d2.c(79.9378f, 112.891f, 81.7643f, 118.768f, 84.7644f, 124.179f);
            d2.c(86.684f, 127.641f, 89.0842f, 130.912f, 91.9663f, 133.896f);
            d2.c(96.5416f, 138.634f, 101.883f, 142.183f, 107.604f, 144.535f);
            d2.c(114.562f, 147.397f, 122.081f, 148.489f, 129.465f, 147.8f);
            d2.c(135.662f, 147.221f, 141.765f, 145.387f, 147.361f, 142.29f);
            zq5Var.c(1.0f, 1.0f, nae.e, 4.0f, nae.e, 1.0f, nae.e, 1, 0, 0, esaVar10, null, "", d2.a);
            esa esaVar11 = new esa(j);
            hy d3 = s21.d(160.711f, 131.126f);
            d3.c(162.102f, 129.423f, 163.352f, 127.642f, 164.461f, 125.799f);
            d3.c(166.901f, 121.744f, 168.66f, 117.388f, 169.734f, 112.897f);
            d3.c(170.821f, 108.356f, 171.209f, 103.676f, 170.894f, 99.0296f);
            d3.c(170.62f, 94.9756f, 169.811f, 90.9475f, 168.465f, 87.0598f);
            d3.c(167.131f, 83.2028f, 165.268f, 79.484f, 162.875f, 76.015f);
            d3.c(161.45f, 73.9479f, 159.836f, 71.9696f, 158.034f, 70.1036f);
            d3.c(155.388f, 67.364f, 152.486f, 65.0219f, 149.402f, 63.0787f);
            d3.c(146.089f, 60.9908f, 142.566f, 59.3634f, 138.926f, 58.1984f);
            d3.c(134.368f, 56.7393f, 129.628f, 56.0054f, 124.886f, 56.0f);
            d3.c(121.197f, 55.9959f, 117.507f, 56.4328f, 113.902f, 57.3125f);
            d3.c(109.845f, 58.3028f, 105.895f, 59.8543f, 102.177f, 61.9692f);
            d3.c(98.9076f, 63.8284f, 95.817f, 66.123f, 92.988f, 68.8547f);
            d3.c(89.4328f, 72.2875f, 86.553f, 76.1572f, 84.3512f, 80.2985f);
            d3.c(82.1956f, 84.3531f, 80.6899f, 88.6682f, 79.8366f, 93.0887f);
            d3.c(78.9574f, 97.6429f, 78.7706f, 102.309f, 79.2789f, 106.918f);
            d3.c(79.9378f, 112.891f, 81.7643f, 118.768f, 84.7644f, 124.179f);
            d3.c(86.684f, 127.641f, 89.0842f, 130.912f, 91.9663f, 133.896f);
            d3.c(96.5416f, 138.634f, 101.883f, 142.183f, 107.604f, 144.535f);
            d3.c(114.562f, 147.397f, 122.081f, 148.489f, 129.465f, 147.8f);
            d3.c(135.662f, 147.221f, 141.765f, 145.387f, 147.361f, 142.29f);
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 1, null, esaVar11, "", d3.a);
            esa esaVar12 = new esa(j2);
            ArrayList arrayList9 = new ArrayList(32);
            arrayList9.add(new rn8(150.701f, 140.378f));
            arrayList9.add(new on8(153.607f, 138.508f, 156.191f, 136.175f, 157.872f, 134.291f));
            arrayList9.add(new qn8(150.701f, 140.378f));
            nn8 nn8Var = nn8.c;
            arrayList9.add(nn8Var);
            zq5Var.c(1.0f, 1.0f, nae.e, 4.0f, nae.e, 1.0f, nae.e, 1, 0, 0, esaVar12, null, "", arrayList9);
            esa esaVar13 = new esa(j);
            ArrayList arrayList10 = new ArrayList(32);
            arrayList10.add(new rn8(150.701f, 140.378f));
            arrayList10.add(new on8(153.607f, 138.508f, 156.191f, 136.175f, 157.872f, 134.291f));
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 0, null, esaVar13, "", arrayList10);
            esa esaVar14 = new esa(b2);
            ArrayList arrayList11 = new ArrayList(32);
            arrayList11.add(new rn8(167.0f, 104.617f));
            arrayList11.add(new on8(166.714f, 104.622f, 166.427f, 104.625f, 166.14f, 104.625f));
            arrayList11.add(new on8(140.886f, 104.625f, 120.209f, 84.9362f, 118.476f, 60.0f));
            arrayList11.add(new on8(98.3752f, 63.1706f, 83.0f, 80.6526f, 83.0f, 101.743f));
            arrayList11.add(new on8(83.0f, 125.081f, 101.825f, 144.0f, 125.048f, 144.0f));
            arrayList11.add(new on8(147.309f, 144.0f, 165.53f, 126.615f, 167.0f, 104.617f));
            arrayList11.add(nn8Var);
            zq5Var.c(1.0f, 1.0f, nae.e, 4.0f, nae.e, 1.0f, nae.e, 0, 0, 0, esaVar14, null, "", arrayList11);
            esa esaVar15 = new esa(j2);
            esa esaVar16 = new esa(j);
            hy d4 = s21.d(109.023f, 100.373f);
            d4.c(107.8f, 99.2433f, 105.903f, 99.33f, 104.785f, 100.567f);
            d4.c(103.668f, 101.803f, 103.753f, 103.721f, 104.977f, 104.851f);
            d4.g(119.096f, 117.889f);
            d4.c(120.808f, 119.47f, 123.465f, 119.349f, 125.029f, 117.618f);
            d4.c(125.095f, 117.544f, 125.095f, 117.544f, 125.158f, 117.469f);
            d4.g(145.307f, 92.9716f);
            d4.c(146.366f, 91.6837f, 146.192f, 89.7716f, 144.918f, 88.7008f);
            d4.c(143.644f, 87.63f, 141.752f, 87.806f, 140.693f, 89.0939f);
            nk2.A(d4, 121.75f, 112.125f, 109.023f, 100.373f);
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 1, 1, 0, esaVar15, esaVar16, "", d4.a);
            esa esaVar17 = new esa(j2);
            ArrayList arrayList12 = new ArrayList(32);
            arrayList12.add(new rn8(110.824f, 64.4131f));
            arrayList12.add(new on8(108.874f, 65.1447f, 106.969f, 66.0338f, 105.128f, 67.0806f));
            arrayList12.add(new on8(102.269f, 68.7072f, 99.5648f, 70.7149f, 97.0899f, 73.1049f));
            arrayList12.add(new on8(96.0754f, 74.0846f, 95.1237f, 75.105f, 94.235f, 76.161f));
            arrayList12.add(new rn8(91.4851f, 79.8378f));
            arrayList12.add(new on8(90.7785f, 80.9057f, 90.1281f, 82.0004f, 89.5342f, 83.1176f));
            arrayList12.add(new on8(89.0956f, 83.9428f, 88.6877f, 84.7803f, 88.3106f, 85.6285f));
            zq5Var.c(1.0f, 1.0f, nae.e, 4.0f, nae.e, 1.0f, nae.e, 1, 0, 0, esaVar17, null, "", arrayList12);
            esa esaVar18 = new esa(j);
            hy d5 = s21.d(111.263f, 65.5835f);
            d5.c(111.909f, 65.341f, 112.237f, 64.6204f, 111.994f, 63.974f);
            d5.c(111.752f, 63.3277f, 111.031f, 63.0003f, 110.385f, 63.2428f);
            d5.g(111.263f, 65.5835f);
            d5.b();
            d5.i(105.128f, 67.0806f);
            nk2.A(d5, 105.746f, 68.1671f, 105.128f, 67.0806f);
            d5.i(97.0899f, 73.1049f);
            nk2.A(d5, 96.2216f, 72.2057f, 97.0899f, 73.1049f);
            d5.i(93.2786f, 75.3562f);
            d5.c(92.8341f, 75.8844f, 92.902f, 76.6729f, 93.4302f, 77.1174f);
            d5.c(93.9584f, 77.5619f, 94.7469f, 77.4941f, 95.1914f, 76.9659f);
            d5.g(93.2786f, 75.3562f);
            d5.b();
            d5.i(92.5275f, 80.5277f);
            d5.c(92.9085f, 79.9519f, 92.7507f, 79.1764f, 92.1749f, 78.7954f);
            d5.c(91.5992f, 78.4144f, 90.8237f, 78.5723f, 90.4427f, 79.148f);
            d5.g(92.5275f, 80.5277f);
            d5.b();
            d5.i(89.5342f, 83.1176f);
            d5.g(90.638f, 83.7044f);
            nk2.A(d5, 90.638f, 83.7044f, 89.5342f, 83.1176f);
            d5.i(87.1684f, 85.1206f);
            d5.c(86.8879f, 85.7515f, 87.1719f, 86.4902f, 87.8027f, 86.7707f);
            d5.c(88.4335f, 87.0511f, 89.1723f, 86.7671f, 89.4528f, 86.1363f);
            d5.g(87.1684f, 85.1206f);
            d5.b();
            d5.i(110.385f, 63.2428f);
            d5.c(108.373f, 63.9973f, 106.409f, 64.9143f, 104.51f, 65.994f);
            d5.g(105.746f, 68.1671f);
            d5.c(107.529f, 67.1532f, 109.374f, 66.2921f, 111.263f, 65.5835f);
            d5.g(110.385f, 63.2428f);
            d5.b();
            d5.i(104.51f, 65.994f);
            d5.c(101.56f, 67.672f, 98.7724f, 69.7424f, 96.2216f, 72.2057f);
            d5.g(97.9582f, 74.0041f);
            d5.c(100.357f, 71.6874f, 102.977f, 69.7425f, 105.746f, 68.1671f);
            d5.g(104.51f, 65.994f);
            d5.b();
            d5.i(96.2216f, 72.2057f);
            d5.c(95.176f, 73.2154f, 94.195f, 74.2673f, 93.2786f, 75.3562f);
            d5.g(95.1914f, 76.9659f);
            d5.c(96.0525f, 75.9427f, 96.9747f, 74.9538f, 97.9582f, 74.0041f);
            d5.g(96.2216f, 72.2057f);
            d5.b();
            d5.i(90.4427f, 79.148f);
            d5.c(89.7138f, 80.2494f, 89.0431f, 81.3785f, 88.4305f, 82.5309f);
            d5.g(90.638f, 83.7044f);
            d5.c(91.2132f, 82.6222f, 91.8431f, 81.562f, 92.5275f, 80.5277f);
            d5.g(90.4427f, 79.148f);
            d5.b();
            d5.i(88.4305f, 82.5309f);
            d5.c(87.978f, 83.382f, 87.5573f, 84.2459f, 87.1684f, 85.1206f);
            d5.g(89.4528f, 86.1363f);
            d5.c(89.818f, 85.3148f, 90.2131f, 84.5036f, 90.638f, 83.7044f);
            d5.g(88.4305f, 82.5309f);
            d5.b();
            zq5Var.c(1.0f, 1.0f, nae.e, 4.0f, nae.e, 1.0f, nae.e, 0, 0, 0, esaVar18, null, "", d5.a);
            P = zq5Var.e();
            rv4Var.o0(P);
        }
        return (ar5) P;
    }

    public static ar5 D(rv4 rv4Var) {
        tza tzaVar = j27.a;
        long j = ((h27) rv4Var.j(tzaVar)).a.a;
        long j2 = ((h27) rv4Var.j(tzaVar)).a.n;
        long b2 = zl1.b(0.3f, ((h27) rv4Var.j(tzaVar)).a.c);
        boolean e2 = rv4Var.e(j) | rv4Var.e(j2) | rv4Var.e(b2);
        Object P = rv4Var.P();
        if (e2 || P == ax1.a) {
            zq5 zq5Var = new zq5("emptyinbox", 250.0f, 200.0f, 250.0f, 200.0f, 0L, 0, false, 224);
            esa esaVar = new esa(b2);
            int i = k4d.a;
            hy hyVar = new hy(2);
            hyVar.i(63.0f, 134.0f);
            hyVar.e(154.0f);
            hyVar.c(154.515f, 134.0f, 155.017f, 133.944f, 155.5f, 133.839f);
            hyVar.c(155.983f, 133.944f, 156.485f, 134.0f, 157.0f, 134.0f);
            hyVar.e(209.0f);
            hyVar.c(212.866f, 134.0f, 216.0f, 130.866f, 216.0f, 127.0f);
            hyVar.c(216.0f, 123.134f, 212.866f, 120.0f, 209.0f, 120.0f);
            hyVar.e(203.0f);
            hyVar.c(199.134f, 120.0f, 196.0f, 116.866f, 196.0f, 113.0f);
            hyVar.c(196.0f, 109.134f, 199.134f, 106.0f, 203.0f, 106.0f);
            hyVar.e(222.0f);
            hyVar.c(225.866f, 106.0f, 229.0f, 102.866f, 229.0f, 99.0f);
            hyVar.c(229.0f, 95.134f, 225.866f, 92.0f, 222.0f, 92.0f);
            hyVar.e(200.0f);
            hyVar.c(203.866f, 92.0f, 207.0f, 88.866f, 207.0f, 85.0f);
            hyVar.c(207.0f, 81.134f, 203.866f, 78.0f, 200.0f, 78.0f);
            hyVar.e(136.0f);
            hyVar.c(139.866f, 78.0f, 143.0f, 74.866f, 143.0f, 71.0f);
            hyVar.c(143.0f, 67.134f, 139.866f, 64.0f, 136.0f, 64.0f);
            hyVar.e(79.0f);
            hyVar.c(75.134f, 64.0f, 72.0f, 67.134f, 72.0f, 71.0f);
            hyVar.c(72.0f, 74.866f, 75.134f, 78.0f, 79.0f, 78.0f);
            hyVar.e(39.0f);
            hyVar.c(35.134f, 78.0f, 32.0f, 81.134f, 32.0f, 85.0f);
            hyVar.c(32.0f, 88.866f, 35.134f, 92.0f, 39.0f, 92.0f);
            hyVar.e(64.0f);
            hyVar.c(67.866f, 92.0f, 71.0f, 95.134f, 71.0f, 99.0f);
            hyVar.c(71.0f, 102.866f, 67.866f, 106.0f, 64.0f, 106.0f);
            hyVar.e(24.0f);
            hyVar.c(20.134f, 106.0f, 17.0f, 109.134f, 17.0f, 113.0f);
            hyVar.c(17.0f, 116.866f, 20.134f, 120.0f, 24.0f, 120.0f);
            hyVar.e(63.0f);
            hyVar.c(59.134f, 120.0f, 56.0f, 123.134f, 56.0f, 127.0f);
            hyVar.c(56.0f, 130.866f, 59.134f, 134.0f, 63.0f, 134.0f);
            hyVar.b();
            hyVar.i(226.0f, 134.0f);
            hyVar.c(229.866f, 134.0f, 233.0f, 130.866f, 233.0f, 127.0f);
            hyVar.c(233.0f, 123.134f, 229.866f, 120.0f, 226.0f, 120.0f);
            hyVar.c(222.134f, 120.0f, 219.0f, 123.134f, 219.0f, 127.0f);
            hyVar.c(219.0f, 130.866f, 222.134f, 134.0f, 226.0f, 134.0f);
            hyVar.b();
            zq5Var.c(1.0f, 1.0f, nae.e, 4.0f, nae.e, 1.0f, nae.e, 1, 0, 0, esaVar, null, "", hyVar.a);
            esa esaVar2 = new esa(j2);
            hy d2 = s21.d(113.119f, 112.307f);
            d2.c(113.04f, 112.86f, 113.0f, 113.425f, 113.0f, 114.0f);
            d2.c(113.0f, 120.627f, 118.373f, 126.0f, 125.0f, 126.0f);
            d2.c(131.627f, 126.0f, 137.0f, 120.627f, 137.0f, 114.0f);
            d2.c(137.0f, 113.425f, 136.96f, 112.86f, 136.881f, 112.307f);
            d2.e(166.0f);
            d2.o(139.0f);
            d2.c(166.0f, 140.657f, 164.657f, 142.0f, 163.0f, 142.0f);
            d2.e(87.0f);
            d2.c(85.3431f, 142.0f, 84.0f, 140.657f, 84.0f, 139.0f);
            d2.o(112.307f);
            d2.e(113.119f);
            d2.b();
            zq5Var.c(1.0f, 1.0f, nae.e, 4.0f, nae.e, 1.0f, nae.e, 1, 0, 0, esaVar2, null, "", d2.a);
            esa esaVar3 = new esa(j2);
            hy d3 = s21.d(138.0f, 112.0f);
            d3.c(138.0f, 119.18f, 132.18f, 125.0f, 125.0f, 125.0f);
            d3.c(117.82f, 125.0f, 112.0f, 119.18f, 112.0f, 112.0f);
            d3.c(112.0f, 111.767f, 112.006f, 111.536f, 112.018f, 111.307f);
            d3.e(84.0f);
            d3.g(93.5604f, 83.0389f);
            d3.c(93.9726f, 81.8202f, 95.1159f, 81.0f, 96.4023f, 81.0f);
            d3.e(153.598f);
            d3.c(154.884f, 81.0f, 156.027f, 81.8202f, 156.44f, 83.0389f);
            d3.g(166.0f, 111.307f);
            d3.e(137.982f);
            d3.c(137.994f, 111.536f, 138.0f, 111.767f, 138.0f, 112.0f);
            d3.b();
            zq5Var.c(1.0f, 1.0f, nae.e, 4.0f, nae.e, 1.0f, nae.e, 1, 0, 0, esaVar3, null, "", d3.a);
            esa esaVar4 = new esa(b2);
            hy d4 = s21.d(136.098f, 112.955f);
            d4.c(136.098f, 118.502f, 131.129f, 124.0f, 125.0f, 124.0f);
            d4.c(118.871f, 124.0f, 113.902f, 118.502f, 113.902f, 112.955f);
            d4.c(113.902f, 112.775f, 113.908f, 111.596f, 113.918f, 111.419f);
            d4.e(93.0f);
            d4.g(101.161f, 91.5755f);
            d4.c(101.513f, 90.6338f, 102.489f, 90.0f, 103.587f, 90.0f);
            d4.e(146.413f);
            d4.c(147.511f, 90.0f, 148.487f, 90.6338f, 148.839f, 91.5755f);
            d4.g(157.0f, 111.419f);
            d4.e(136.082f);
            d4.c(136.092f, 111.596f, 136.098f, 112.775f, 136.098f, 112.955f);
            d4.b();
            zq5Var.c(1.0f, 1.0f, nae.e, 4.0f, nae.e, 1.0f, nae.e, 1, 0, 0, esaVar4, null, "", d4.a);
            esa esaVar5 = new esa(j);
            hy hyVar2 = new hy(2);
            hyVar2.i(85.25f, 111.512f);
            hyVar2.o(138.0f);
            hyVar2.c(85.25f, 138.966f, 86.0335f, 139.75f, 87.0f, 139.75f);
            hyVar2.e(163.0f);
            hyVar2.c(163.966f, 139.75f, 164.75f, 138.966f, 164.75f, 138.0f);
            hyVar2.o(111.512f);
            hyVar2.g(155.255f, 83.4393f);
            hyVar2.c(155.015f, 82.7285f, 154.348f, 82.25f, 153.598f, 82.25f);
            hyVar2.e(96.4023f);
            hyVar2.c(95.6519f, 82.25f, 94.985f, 82.7285f, 94.7446f, 83.4393f);
            hyVar2.g(85.25f, 111.512f);
            hyVar2.b();
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 0, 0, null, esaVar5, "", hyVar2.a);
            esa esaVar6 = new esa(j);
            hy d5 = s21.d(98.0f, 111.0f);
            d5.c(101.937f, 111.0f, 106.185f, 111.0f, 110.745f, 111.0f);
            d5.c(112.621f, 111.0f, 112.621f, 112.319f, 112.621f, 113.0f);
            d5.c(112.621f, 119.627f, 118.117f, 125.0f, 124.897f, 125.0f);
            d5.c(131.677f, 125.0f, 137.173f, 119.627f, 137.173f, 113.0f);
            d5.c(137.173f, 112.319f, 137.173f, 111.0f, 139.05f, 111.0f);
            d5.e(164.0f);
            d5.i(90.5737f, 111.0f);
            d5.e(93.0f);
            d5.e(90.5737f);
            d5.b();
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 1, null, esaVar6, "", d5.a);
            esa esaVar7 = new esa(j);
            hy hyVar3 = new hy(2);
            hyVar3.i(150.1f, 58.3027f);
            hyVar3.g(139.0f, 70.7559f);
            hyVar3.i(124.1f, 54.0f);
            hyVar3.o(70.7559f);
            hyVar3.o(54.0f);
            hyVar3.b();
            hyVar3.i(98.0f, 58.3027f);
            nk2.A(hyVar3, 109.1f, 70.7559f, 98.0f, 58.3027f);
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 1, null, esaVar7, "", hyVar3.a);
            P = zq5Var.e();
            rv4Var.o0(P);
        }
        return (ar5) P;
    }

    public static ar5 E(rv4 rv4Var) {
        tza tzaVar = j27.a;
        long j = ((h27) rv4Var.j(tzaVar)).a.a;
        long j2 = ((h27) rv4Var.j(tzaVar)).a.n;
        long b2 = zl1.b(0.3f, ((h27) rv4Var.j(tzaVar)).a.c);
        boolean e2 = rv4Var.e(j) | rv4Var.e(j2) | rv4Var.e(b2);
        Object P = rv4Var.P();
        if (e2 || P == ax1.a) {
            zq5 zq5Var = new zq5("error", 250.0f, 200.0f, 250.0f, 200.0f, 0L, 0, false, 224);
            esa esaVar = new esa(b2);
            int i = k4d.a;
            hy hyVar = new hy(2);
            hyVar.i(63.0f, 134.0f);
            hyVar.e(154.0f);
            hyVar.c(154.515f, 134.0f, 155.017f, 133.944f, 155.5f, 133.839f);
            hyVar.c(155.983f, 133.944f, 156.485f, 134.0f, 157.0f, 134.0f);
            hyVar.e(209.0f);
            hyVar.c(212.866f, 134.0f, 216.0f, 130.866f, 216.0f, 127.0f);
            hyVar.c(216.0f, 123.134f, 212.866f, 120.0f, 209.0f, 120.0f);
            hyVar.e(203.0f);
            hyVar.c(199.134f, 120.0f, 196.0f, 116.866f, 196.0f, 113.0f);
            hyVar.c(196.0f, 109.134f, 199.134f, 106.0f, 203.0f, 106.0f);
            hyVar.e(222.0f);
            hyVar.c(225.866f, 106.0f, 229.0f, 102.866f, 229.0f, 99.0f);
            hyVar.c(229.0f, 95.134f, 225.866f, 92.0f, 222.0f, 92.0f);
            hyVar.e(200.0f);
            hyVar.c(203.866f, 92.0f, 207.0f, 88.866f, 207.0f, 85.0f);
            hyVar.c(207.0f, 81.134f, 203.866f, 78.0f, 200.0f, 78.0f);
            hyVar.e(136.0f);
            hyVar.c(139.866f, 78.0f, 143.0f, 74.866f, 143.0f, 71.0f);
            hyVar.c(143.0f, 67.134f, 139.866f, 64.0f, 136.0f, 64.0f);
            hyVar.e(79.0f);
            hyVar.c(75.134f, 64.0f, 72.0f, 67.134f, 72.0f, 71.0f);
            hyVar.c(72.0f, 74.866f, 75.134f, 78.0f, 79.0f, 78.0f);
            hyVar.e(39.0f);
            hyVar.c(35.134f, 78.0f, 32.0f, 81.134f, 32.0f, 85.0f);
            hyVar.c(32.0f, 88.866f, 35.134f, 92.0f, 39.0f, 92.0f);
            hyVar.e(64.0f);
            hyVar.c(67.866f, 92.0f, 71.0f, 95.134f, 71.0f, 99.0f);
            hyVar.c(71.0f, 102.866f, 67.866f, 106.0f, 64.0f, 106.0f);
            hyVar.e(24.0f);
            hyVar.c(20.134f, 106.0f, 17.0f, 109.134f, 17.0f, 113.0f);
            hyVar.c(17.0f, 116.866f, 20.134f, 120.0f, 24.0f, 120.0f);
            hyVar.e(63.0f);
            hyVar.c(59.134f, 120.0f, 56.0f, 123.134f, 56.0f, 127.0f);
            hyVar.c(56.0f, 130.866f, 59.134f, 134.0f, 63.0f, 134.0f);
            hyVar.b();
            hyVar.i(226.0f, 134.0f);
            hyVar.c(229.866f, 134.0f, 233.0f, 130.866f, 233.0f, 127.0f);
            hyVar.c(233.0f, 123.134f, 229.866f, 120.0f, 226.0f, 120.0f);
            hyVar.c(222.134f, 120.0f, 219.0f, 123.134f, 219.0f, 127.0f);
            hyVar.c(219.0f, 130.866f, 222.134f, 134.0f, 226.0f, 134.0f);
            hyVar.b();
            zq5Var.c(1.0f, 1.0f, nae.e, 4.0f, nae.e, 1.0f, nae.e, 1, 0, 0, esaVar, null, "", hyVar.a);
            esa esaVar2 = new esa(j2);
            hy d2 = s21.d(92.0f, 140.0f);
            d2.c(79.8497f, 140.0f, 70.0f, 130.374f, 70.0f, 118.5f);
            d2.c(70.0f, 106.626f, 79.8497f, 97.0f, 92.0f, 97.0f);
            d2.c(92.5167f, 97.0f, 93.0292f, 97.0174f, 93.537f, 97.0517f);
            d2.c(93.1842f, 95.0878f, 93.0f, 93.0654f, 93.0f, 91.0f);
            d2.c(93.0f, 72.2223f, 108.222f, 57.0f, 127.0f, 57.0f);
            d2.c(141.991f, 57.0f, 154.716f, 66.702f, 159.239f, 80.1695f);
            d2.c(160.31f, 80.0575f, 161.398f, 80.0f, 162.5f, 80.0f);
            d2.c(179.345f, 80.0f, 193.0f, 93.4315f, 193.0f, 110.0f);
            d2.c(193.0f, 125.741f, 180.675f, 138.727f, 165.0f, 139.978f);
            d2.o(140.0f);
            d2.e(108.508f);
            d2.e(92.0f);
            d2.b();
            d2.i(103.996f, 140.0f);
            d2.e(97.0314f);
            d2.e(103.996f);
            d2.b();
            zq5Var.c(1.0f, 1.0f, nae.e, 4.0f, nae.e, 1.0f, nae.e, 1, 0, 0, esaVar2, null, "", d2.a);
            esa esaVar3 = new esa(j);
            hy hyVar2 = new hy(2);
            hyVar2.i(103.996f, 140.0f);
            hyVar2.e(97.0314f);
            hyVar2.i(92.0f, 140.0f);
            hyVar2.c(79.8497f, 140.0f, 70.0f, 130.374f, 70.0f, 118.5f);
            hyVar2.c(70.0f, 106.626f, 79.8497f, 97.0f, 92.0f, 97.0f);
            hyVar2.c(92.5167f, 97.0f, 93.0292f, 97.0174f, 93.537f, 97.0517f);
            hyVar2.c(93.1842f, 95.0878f, 93.0f, 93.0654f, 93.0f, 91.0f);
            hyVar2.c(93.0f, 72.2223f, 108.222f, 57.0f, 127.0f, 57.0f);
            hyVar2.c(141.991f, 57.0f, 154.716f, 66.702f, 159.239f, 80.1695f);
            hyVar2.c(160.31f, 80.0575f, 161.398f, 80.0f, 162.5f, 80.0f);
            hyVar2.c(179.345f, 80.0f, 193.0f, 93.4315f, 193.0f, 110.0f);
            hyVar2.c(193.0f, 125.741f, 180.675f, 138.727f, 165.0f, 139.978f);
            hyVar2.o(140.0f);
            hyVar2.e(108.508f);
            hyVar2.e(92.0f);
            hyVar2.b();
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 0, null, esaVar3, "", hyVar2.a);
            esa esaVar4 = new esa(b2);
            hy d3 = s21.d(116.612f, 64.3426f);
            d3.c(116.612f, 96.5657f, 145.633f, 123.118f, 183.0f, 126.703f);
            d3.c(178.317f, 132.461f, 171.086f, 136.368f, 162.847f, 136.981f);
            d3.o(137.0f);
            d3.e(95.7431f);
            d3.c(87.6013f, 137.0f, 74.0f, 133.57f, 74.0f, 118.548f);
            d3.c(74.0f, 103.527f, 84.5742f, 100.097f, 95.7431f, 100.097f);
            d3.c(96.218f, 100.097f, 96.6891f, 100.112f, 97.1559f, 100.141f);
            d3.c(96.8316f, 98.4556f, 96.7746f, 96.7184f, 96.6623f, 94.9474f);
            d3.c(95.9038f, 82.9842f, 101.123f, 67.907f, 116.63f, 63.0f);
            d3.c(116.618f, 63.4473f, 116.612f, 63.8944f, 116.612f, 64.3426f);
            d3.b();
            d3.i(127.116f, 114.758f);
            d3.c(124.078f, 114.758f, 121.614f, 117.192f, 121.614f, 120.195f);
            d3.c(121.614f, 123.198f, 124.078f, 125.632f, 127.116f, 125.632f);
            d3.c(130.155f, 125.632f, 132.618f, 123.198f, 132.618f, 120.195f);
            d3.c(132.618f, 117.192f, 130.155f, 114.758f, 127.116f, 114.758f);
            d3.b();
            zq5Var.c(1.0f, 1.0f, nae.e, 4.0f, nae.e, 1.0f, nae.e, 1, 0, 0, esaVar4, null, "", d3.a);
            esa esaVar5 = new esa(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new rn8(127.5f, 126.0f));
            arrayList.add(new on8(130.538f, 126.0f, 133.0f, 123.538f, 133.0f, 120.5f));
            arrayList.add(new on8(133.0f, 117.462f, 130.538f, 115.0f, 127.5f, 115.0f));
            arrayList.add(new on8(124.462f, 115.0f, 122.0f, 117.462f, 122.0f, 120.5f));
            arrayList.add(new on8(122.0f, 123.538f, 124.462f, 126.0f, 127.5f, 126.0f));
            nn8 nn8Var = nn8.c;
            arrayList.add(nn8Var);
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 0, 0, null, esaVar5, "", arrayList);
            esa esaVar6 = new esa(j);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new rn8(112.0f, 109.0f));
            arrayList2.add(new qn8(119.0f, 103.507f));
            arrayList2.add(new qn8(112.0f, 98.2776f));
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 1, null, esaVar6, "", arrayList2);
            esa esaVar7 = new esa(j);
            ArrayList arrayList3 = new ArrayList(32);
            arrayList3.add(new rn8(143.0f, 109.0f));
            arrayList3.add(new qn8(136.0f, 103.507f));
            arrayList3.add(new qn8(143.0f, 98.2776f));
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 1, null, esaVar7, "", arrayList3);
            esa esaVar8 = new esa(j);
            ArrayList arrayList4 = new ArrayList(32);
            arrayList4.add(new rn8(137.0f, 67.0f));
            arrayList4.add(new on8(143.509f, 68.7226f, 148.648f, 73.8129f, 150.44f, 80.2932f));
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 0, null, esaVar8, "", arrayList4);
            esa esaVar9 = new esa(j);
            ArrayList arrayList5 = new ArrayList(32);
            arrayList5.add(new rn8(158.0f, 50.0f));
            arrayList5.add(new on8(159.657f, 50.0f, 161.0f, 48.6569f, 161.0f, 47.0f));
            arrayList5.add(new on8(161.0f, 45.3431f, 159.657f, 44.0f, 158.0f, 44.0f));
            arrayList5.add(new on8(156.343f, 44.0f, 155.0f, 45.3431f, 155.0f, 47.0f));
            arrayList5.add(new on8(155.0f, 48.6569f, 156.343f, 50.0f, 158.0f, 50.0f));
            arrayList5.add(nn8Var);
            zq5Var.c(1.0f, 1.0f, 2.0f, 4.0f, nae.e, 1.0f, nae.e, 0, 0, 0, null, esaVar9, "", arrayList5);
            esa esaVar10 = new esa(j);
            ArrayList arrayList6 = new ArrayList(32);
            arrayList6.add(new rn8(189.0f, 66.0f));
            arrayList6.add(new on8(190.657f, 66.0f, 192.0f, 64.6569f, 192.0f, 63.0f));
            arrayList6.add(new on8(192.0f, 61.3431f, 190.657f, 60.0f, 189.0f, 60.0f));
            arrayList6.add(new on8(187.343f, 60.0f, 186.0f, 61.3431f, 186.0f, 63.0f));
            arrayList6.add(new on8(186.0f, 64.6569f, 187.343f, 66.0f, 189.0f, 66.0f));
            arrayList6.add(nn8Var);
            zq5Var.c(1.0f, 1.0f, nae.e, 4.0f, nae.e, 1.0f, nae.e, 0, 0, 0, esaVar10, null, "", arrayList6);
            esa esaVar11 = new esa(j);
            ArrayList arrayList7 = new ArrayList(32);
            arrayList7.add(new rn8(165.757f, 57.7573f));
            arrayList7.add(new qn8(174.116f, 66.1156f));
            arrayList7.add(new rn8(174.243f, 57.7573f));
            arrayList7.add(new qn8(165.884f, 66.1156f));
            arrayList7.add(new qn8(174.243f, 57.7573f));
            arrayList7.add(nn8Var);
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 1, null, esaVar11, "", arrayList7);
            esa esaVar12 = new esa(j);
            ArrayList arrayList8 = new ArrayList(32);
            arrayList8.add(new rn8(71.4038f, 75.5962f));
            arrayList8.add(new qn8(77.4038f, 81.5962f));
            arrayList8.add(new rn8(77.4038f, 75.5962f));
            arrayList8.add(new qn8(71.4038f, 81.5962f));
            arrayList8.add(new qn8(77.4038f, 75.5962f));
            arrayList8.add(nn8Var);
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 1, null, esaVar12, "", arrayList8);
            esa esaVar13 = new esa(j);
            ArrayList arrayList9 = new ArrayList(32);
            arrayList9.add(new rn8(85.0f, 69.0f));
            arrayList9.add(new on8(86.6569f, 69.0f, 88.0f, 67.6569f, 88.0f, 66.0f));
            arrayList9.add(new on8(88.0f, 64.3431f, 86.6569f, 63.0f, 85.0f, 63.0f));
            arrayList9.add(new on8(83.3431f, 63.0f, 82.0f, 64.3431f, 82.0f, 66.0f));
            arrayList9.add(new on8(82.0f, 67.6569f, 83.3431f, 69.0f, 85.0f, 69.0f));
            arrayList9.add(nn8Var);
            zq5Var.c(1.0f, 1.0f, nae.e, 4.0f, nae.e, 1.0f, nae.e, 0, 0, 0, esaVar13, null, "", arrayList9);
            P = zq5Var.e();
            rv4Var.o0(P);
        }
        return (ar5) P;
    }

    public static ar5 F(rv4 rv4Var) {
        tza tzaVar = j27.a;
        long j = ((h27) rv4Var.j(tzaVar)).a.a;
        long j2 = ((h27) rv4Var.j(tzaVar)).a.n;
        long b2 = zl1.b(0.3f, ((h27) rv4Var.j(tzaVar)).a.c);
        boolean e2 = rv4Var.e(j) | rv4Var.e(j2) | rv4Var.e(b2);
        Object P = rv4Var.P();
        if (e2 || P == ax1.a) {
            zq5 zq5Var = new zq5("nodocuments", 250.0f, 200.0f, 250.0f, 200.0f, 0L, 0, false, 224);
            esa esaVar = new esa(b2);
            int i = k4d.a;
            hy d2 = s21.d(207.0f, 65.0f);
            d2.c(210.866f, 65.0f, 214.0f, 68.134f, 214.0f, 72.0f);
            d2.c(214.0f, 75.866f, 210.866f, 79.0f, 207.0f, 79.0f);
            d2.e(167.0f);
            d2.c(170.866f, 79.0f, 174.0f, 82.134f, 174.0f, 86.0f);
            d2.c(174.0f, 89.866f, 170.866f, 93.0f, 167.0f, 93.0f);
            d2.e(189.0f);
            d2.c(192.866f, 93.0f, 196.0f, 96.134f, 196.0f, 100.0f);
            d2.c(196.0f, 103.866f, 192.866f, 107.0f, 189.0f, 107.0f);
            d2.e(178.826f);
            d2.c(173.952f, 107.0f, 170.0f, 110.134f, 170.0f, 114.0f);
            d2.c(170.0f, 116.577f, 172.0f, 118.911f, 176.0f, 121.0f);
            d2.c(179.866f, 121.0f, 183.0f, 124.134f, 183.0f, 128.0f);
            d2.c(183.0f, 131.866f, 179.866f, 135.0f, 176.0f, 135.0f);
            d2.e(93.0f);
            d2.c(89.134f, 135.0f, 86.0f, 131.866f, 86.0f, 128.0f);
            d2.c(86.0f, 124.134f, 89.134f, 121.0f, 93.0f, 121.0f);
            d2.e(54.0f);
            d2.c(50.134f, 121.0f, 47.0f, 117.866f, 47.0f, 114.0f);
            d2.c(47.0f, 110.134f, 50.134f, 107.0f, 54.0f, 107.0f);
            d2.e(94.0f);
            d2.c(97.866f, 107.0f, 101.0f, 103.866f, 101.0f, 100.0f);
            d2.c(101.0f, 96.134f, 97.866f, 93.0f, 94.0f, 93.0f);
            d2.e(69.0f);
            d2.c(65.134f, 93.0f, 62.0f, 89.866f, 62.0f, 86.0f);
            d2.c(62.0f, 82.134f, 65.134f, 79.0f, 69.0f, 79.0f);
            d2.e(109.0f);
            d2.c(105.134f, 79.0f, 102.0f, 75.866f, 102.0f, 72.0f);
            d2.c(102.0f, 68.134f, 105.134f, 65.0f, 109.0f, 65.0f);
            d2.e(207.0f);
            d2.b();
            d2.i(207.0f, 93.0f);
            d2.c(210.866f, 93.0f, 214.0f, 96.134f, 214.0f, 100.0f);
            d2.c(214.0f, 103.866f, 210.866f, 107.0f, 207.0f, 107.0f);
            d2.c(203.134f, 107.0f, 200.0f, 103.866f, 200.0f, 100.0f);
            d2.c(200.0f, 96.134f, 203.134f, 93.0f, 207.0f, 93.0f);
            d2.b();
            zq5Var.c(1.0f, 1.0f, nae.e, 4.0f, nae.e, 1.0f, nae.e, 1, 0, 0, esaVar, null, "", d2.a);
            esa esaVar2 = new esa(j2);
            hy hyVar = new hy(2);
            hyVar.i(153.672f, 64.0f);
            hyVar.g(162.974f, 131.843f);
            hyVar.g(163.809f, 138.649f);
            hyVar.c(164.079f, 140.842f, 162.519f, 142.837f, 160.327f, 143.107f);
            hyVar.g(101.766f, 150.297f);
            hyVar.c(99.5738f, 150.566f, 97.578f, 149.007f, 97.3088f, 146.814f);
            hyVar.g(88.2931f, 73.3868f);
            hyVar.c(88.1584f, 72.2904f, 88.9381f, 71.2925f, 90.0344f, 71.1579f);
            hyVar.c(90.0413f, 71.1571f, 90.0483f, 71.1563f, 90.0552f, 71.1555f);
            hyVar.g(94.9136f, 70.6105f);
            hyVar.i(98.8421f, 70.1698f);
            nk2.A(hyVar, 103.429f, 69.6553f, 98.8421f, 70.1698f);
            zq5Var.c(1.0f, 1.0f, nae.e, 4.0f, nae.e, 1.0f, nae.e, 1, 0, 0, esaVar2, null, "", hyVar.a);
            esa esaVar3 = new esa(j);
            hy d3 = s21.d(154.91f, 63.8302f);
            d3.c(154.816f, 63.1463f, 154.186f, 62.6678f, 153.502f, 62.7616f);
            d3.c(152.818f, 62.8554f, 152.34f, 63.4859f, 152.433f, 64.1698f);
            d3.g(154.91f, 63.8302f);
            d3.b();
            d3.i(162.974f, 131.843f);
            d3.g(164.214f, 131.69f);
            d3.c(164.214f, 131.685f, 164.213f, 131.679f, 164.212f, 131.673f);
            d3.g(162.974f, 131.843f);
            d3.b();
            d3.i(97.3088f, 146.814f);
            nk2.A(d3, 98.5495f, 146.662f, 97.3088f, 146.814f);
            d3.i(88.2931f, 73.3868f);
            nk2.A(d3, 89.5337f, 73.2344f, 88.2931f, 73.3868f);
            d3.i(90.0552f, 71.1555f);
            nk2.A(d3, 89.9159f, 69.9133f, 90.0552f, 71.1555f);
            d3.i(95.0529f, 71.8527f);
            d3.c(95.739f, 71.7758f, 96.2327f, 71.1572f, 96.1558f, 70.4712f);
            d3.c(96.0788f, 69.7851f, 95.4603f, 69.2913f, 94.7742f, 69.3683f);
            d3.g(95.0529f, 71.8527f);
            d3.b();
            d3.i(98.7028f, 68.9276f);
            d3.c(98.0167f, 69.0046f, 97.5229f, 69.6231f, 97.5999f, 70.3092f);
            d3.c(97.6768f, 70.9952f, 98.2954f, 71.489f, 98.9814f, 71.412f);
            d3.g(98.7028f, 68.9276f);
            d3.b();
            d3.i(103.568f, 70.8975f);
            d3.c(104.255f, 70.8205f, 104.748f, 70.202f, 104.671f, 69.5159f);
            d3.c(104.594f, 68.8299f, 103.976f, 68.3361f, 103.29f, 68.4131f);
            d3.g(103.568f, 70.8975f);
            d3.b();
            d3.i(152.433f, 64.1698f);
            d3.g(161.735f, 132.013f);
            d3.g(164.212f, 131.673f);
            nk2.A(d3, 154.91f, 63.8302f, 152.433f, 64.1698f);
            d3.i(161.733f, 131.995f);
            d3.g(162.569f, 138.801f);
            d3.g(165.05f, 138.497f);
            nk2.A(d3, 164.214f, 131.69f, 161.733f, 131.995f);
            d3.i(162.569f, 138.801f);
            d3.c(162.754f, 140.309f, 161.682f, 141.681f, 160.174f, 141.866f);
            d3.g(160.479f, 144.347f);
            d3.c(163.357f, 143.994f, 165.403f, 141.375f, 165.05f, 138.497f);
            d3.g(162.569f, 138.801f);
            d3.b();
            d3.i(160.174f, 141.866f);
            d3.g(101.614f, 149.056f);
            d3.g(101.919f, 151.538f);
            nk2.A(d3, 160.479f, 144.347f, 160.174f, 141.866f);
            d3.i(101.614f, 149.056f);
            d3.c(100.107f, 149.241f, 98.7346f, 148.169f, 98.5495f, 146.662f);
            d3.g(96.0681f, 146.967f);
            d3.c(96.4215f, 149.845f, 99.0409f, 151.891f, 101.919f, 151.538f);
            d3.g(101.614f, 149.056f);
            d3.b();
            d3.i(98.5495f, 146.662f);
            d3.g(89.5337f, 73.2344f);
            d3.g(87.0524f, 73.5391f);
            nk2.A(d3, 96.0681f, 146.967f, 98.5495f, 146.662f);
            d3.i(89.5337f, 73.2344f);
            d3.c(89.4833f, 72.8233f, 89.7756f, 72.4491f, 90.1867f, 72.3986f);
            d3.g(89.8821f, 69.9173f);
            d3.c(88.1005f, 70.136f, 86.8336f, 71.7576f, 87.0524f, 73.5391f);
            d3.g(89.5337f, 73.2344f);
            d3.b();
            d3.i(90.1867f, 72.3986f);
            d3.c(90.1893f, 72.3983f, 90.1919f, 72.398f, 90.1945f, 72.3977f);
            d3.g(89.9159f, 69.9133f);
            d3.c(89.9046f, 69.9145f, 89.8933f, 69.9159f, 89.8821f, 69.9173f);
            d3.g(90.1867f, 72.3986f);
            d3.b();
            d3.i(90.1945f, 72.3977f);
            d3.g(95.0529f, 71.8527f);
            d3.g(94.7742f, 69.3683f);
            nk2.A(d3, 89.9159f, 69.9133f, 90.1945f, 72.3977f);
            d3.i(98.9814f, 71.412f);
            d3.g(103.568f, 70.8975f);
            d3.g(103.29f, 68.4131f);
            nk2.A(d3, 98.7028f, 68.9276f, 98.9814f, 71.412f);
            d3.i(103.29f, 68.4131f);
            d3.g(98.7028f, 68.9276f);
            d3.g(98.9814f, 71.412f);
            nk2.A(d3, 103.568f, 70.8975f, 103.29f, 68.4131f);
            zq5Var.c(1.0f, 1.0f, nae.e, 4.0f, nae.e, 1.0f, nae.e, 0, 0, 0, esaVar3, null, "", d3.a);
            esa esaVar4 = new esa(b2);
            hy hyVar2 = new hy(2);
            hyVar2.i(151.14f, 68.2692f);
            hyVar2.g(159.56f, 129.753f);
            hyVar2.g(160.317f, 135.921f);
            hyVar2.c(160.561f, 137.908f, 159.167f, 139.715f, 157.203f, 139.956f);
            hyVar2.g(104.761f, 146.395f);
            hyVar2.c(102.798f, 146.636f, 101.008f, 145.22f, 100.764f, 143.233f);
            hyVar2.g(92.6141f, 76.8568f);
            hyVar2.c(92.4795f, 75.7605f, 93.2591f, 74.7626f, 94.3555f, 74.628f);
            hyVar2.g(100.843f, 73.8314f);
            zq5Var.c(1.0f, 1.0f, nae.e, 4.0f, nae.e, 1.0f, nae.e, 1, 0, 0, esaVar4, null, "", hyVar2.a);
            esa esaVar5 = new esa(j2);
            esa esaVar6 = new esa(j);
            hy hyVar3 = new hy(2);
            hyVar3.i(110.672f, 51.25f);
            hyVar3.e(156.229f);
            hyVar3.c(156.958f, 51.25f, 157.657f, 51.5393f, 158.173f, 52.0547f);
            hyVar3.g(171.616f, 65.4902f);
            hyVar3.c(172.132f, 66.0059f, 172.422f, 66.7053f, 172.422f, 67.4346f);
            hyVar3.o(130.0f);
            hyVar3.c(172.422f, 131.519f, 171.191f, 132.75f, 169.672f, 132.75f);
            hyVar3.e(110.672f);
            hyVar3.c(109.153f, 132.75f, 107.922f, 131.519f, 107.922f, 130.0f);
            hyVar3.o(54.0f);
            hyVar3.c(107.922f, 52.4812f, 109.153f, 51.25f, 110.672f, 51.25f);
            hyVar3.b();
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 0, 0, esaVar5, esaVar6, "", hyVar3.a);
            esa esaVar7 = new esa(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new rn8(156.672f, 52.4028f));
            arrayList.add(new eo8(64.0f));
            arrayList.add(new on8(156.672f, 65.6569f, 158.015f, 67.0f, 159.672f, 67.0f));
            arrayList.add(new pn8(167.605f));
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 1, null, esaVar7, "", arrayList);
            esa esaVar8 = new esa(j);
            hy hyVar4 = new hy(2);
            hyVar4.i(118.0f, 118.0f);
            hyVar4.e(144.0f);
            hyVar4.i(118.0f, 67.0f);
            hyVar4.e(144.0f);
            hyVar4.e(118.0f);
            hyVar4.b();
            hyVar4.i(118.0f, 79.0f);
            hyVar4.e(161.0f);
            hyVar4.e(118.0f);
            hyVar4.b();
            hyVar4.i(118.0f, 92.0f);
            hyVar4.e(161.0f);
            hyVar4.e(118.0f);
            hyVar4.b();
            hyVar4.i(118.0f, 105.0f);
            hyVar4.e(161.0f);
            hyVar4.e(118.0f);
            hyVar4.b();
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 1, null, esaVar8, "", hyVar4.a);
            P = zq5Var.e();
            rv4Var.o0(P);
        }
        return (ar5) P;
    }

    public static ar5 G(rv4 rv4Var) {
        tza tzaVar = j27.a;
        long j = ((h27) rv4Var.j(tzaVar)).a.a;
        long j2 = ((h27) rv4Var.j(tzaVar)).a.n;
        long b2 = zl1.b(0.3f, ((h27) rv4Var.j(tzaVar)).a.c);
        boolean e2 = rv4Var.e(j) | rv4Var.e(j2) | rv4Var.e(b2);
        Object P = rv4Var.P();
        if (e2 || P == ax1.a) {
            zq5 zq5Var = new zq5("nosearchresult", 250.0f, 200.0f, 250.0f, 200.0f, 0L, 0, false, 224);
            esa esaVar = new esa(b2);
            int i = k4d.a;
            hy d2 = s21.d(207.0f, 65.0f);
            d2.c(210.866f, 65.0f, 214.0f, 68.134f, 214.0f, 72.0f);
            d2.c(214.0f, 75.866f, 210.866f, 79.0f, 207.0f, 79.0f);
            d2.e(167.0f);
            d2.c(170.866f, 79.0f, 174.0f, 82.134f, 174.0f, 86.0f);
            d2.c(174.0f, 89.866f, 170.866f, 93.0f, 167.0f, 93.0f);
            d2.e(189.0f);
            d2.c(192.866f, 93.0f, 196.0f, 96.134f, 196.0f, 100.0f);
            d2.c(196.0f, 103.866f, 192.866f, 107.0f, 189.0f, 107.0f);
            d2.e(178.826f);
            d2.c(173.952f, 107.0f, 170.0f, 110.134f, 170.0f, 114.0f);
            d2.c(170.0f, 116.577f, 172.0f, 118.911f, 176.0f, 121.0f);
            d2.c(179.866f, 121.0f, 183.0f, 124.134f, 183.0f, 128.0f);
            d2.c(183.0f, 131.866f, 179.866f, 135.0f, 176.0f, 135.0f);
            d2.e(93.0f);
            d2.c(89.134f, 135.0f, 86.0f, 131.866f, 86.0f, 128.0f);
            d2.c(86.0f, 124.134f, 89.134f, 121.0f, 93.0f, 121.0f);
            d2.e(54.0f);
            d2.c(50.134f, 121.0f, 47.0f, 117.866f, 47.0f, 114.0f);
            d2.c(47.0f, 110.134f, 50.134f, 107.0f, 54.0f, 107.0f);
            d2.e(94.0f);
            d2.c(97.866f, 107.0f, 101.0f, 103.866f, 101.0f, 100.0f);
            d2.c(101.0f, 96.134f, 97.866f, 93.0f, 94.0f, 93.0f);
            d2.e(69.0f);
            d2.c(65.134f, 93.0f, 62.0f, 89.866f, 62.0f, 86.0f);
            d2.c(62.0f, 82.134f, 65.134f, 79.0f, 69.0f, 79.0f);
            d2.e(109.0f);
            d2.c(105.134f, 79.0f, 102.0f, 75.866f, 102.0f, 72.0f);
            d2.c(102.0f, 68.134f, 105.134f, 65.0f, 109.0f, 65.0f);
            d2.e(207.0f);
            d2.b();
            d2.i(207.0f, 93.0f);
            d2.c(210.866f, 93.0f, 214.0f, 96.134f, 214.0f, 100.0f);
            d2.c(214.0f, 103.866f, 210.866f, 107.0f, 207.0f, 107.0f);
            d2.c(203.134f, 107.0f, 200.0f, 103.866f, 200.0f, 100.0f);
            d2.c(200.0f, 96.134f, 203.134f, 93.0f, 207.0f, 93.0f);
            d2.b();
            zq5Var.c(1.0f, 1.0f, nae.e, 4.0f, nae.e, 1.0f, nae.e, 1, 0, 0, esaVar, null, "", d2.a);
            esa esaVar2 = new esa(b2);
            esa esaVar3 = new esa(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new rn8(120.5f, 133.0f));
            arrayList.add(new on8(139.002f, 133.0f, 154.0f, 118.002f, 154.0f, 99.5f));
            arrayList.add(new on8(154.0f, 80.9985f, 139.002f, 66.0f, 120.5f, 66.0f));
            arrayList.add(new on8(101.998f, 66.0f, 87.0f, 80.9985f, 87.0f, 99.5f));
            arrayList.add(new on8(87.0f, 118.002f, 101.998f, 133.0f, 120.5f, 133.0f));
            nn8 nn8Var = nn8.c;
            arrayList.add(nn8Var);
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 0, 0, esaVar2, esaVar3, "", arrayList);
            esa esaVar4 = new esa(j2);
            hy d3 = s21.d(115.132f, 125.494f);
            d3.c(116.891f, 125.819f, 118.68f, 125.987f, 120.5f, 126.0f);
            d3.c(135.136f, 126.0f, 147.0f, 114.136f, 147.0f, 99.5f);
            d3.c(147.0f, 84.8645f, 135.136f, 73.0f, 120.5f, 73.0f);
            d3.c(116.74f, 73.0f, 113.164f, 73.7829f, 109.924f, 75.1946f);
            d3.c(104.294f, 77.6479f, 99.6816f, 81.9999f, 96.896f, 87.4419f);
            d3.c(95.0445f, 91.0589f, 94.0f, 95.1575f, 94.0f, 99.5f);
            d3.c(94.0f, 103.44f, 94.8599f, 107.179f, 96.4021f, 110.54f);
            d3.c(97.5032f, 112.94f, 98.9521f, 115.146f, 100.684f, 117.096f);
            zq5Var.c(1.0f, 1.0f, nae.e, 4.0f, nae.e, 1.0f, nae.e, 1, 0, 0, esaVar4, null, "", d3.a);
            esa esaVar5 = new esa(j);
            hy d4 = s21.d(115.132f, 125.494f);
            d4.c(116.891f, 125.819f, 118.68f, 125.987f, 120.5f, 126.0f);
            d4.c(135.136f, 126.0f, 147.0f, 114.136f, 147.0f, 99.5f);
            d4.c(147.0f, 84.8645f, 135.136f, 73.0f, 120.5f, 73.0f);
            d4.c(116.74f, 73.0f, 113.164f, 73.7829f, 109.924f, 75.1946f);
            d4.c(104.294f, 77.6479f, 99.6816f, 81.9999f, 96.896f, 87.4419f);
            d4.c(95.0445f, 91.0589f, 94.0f, 95.1575f, 94.0f, 99.5f);
            d4.c(94.0f, 103.44f, 94.8599f, 107.179f, 96.4021f, 110.54f);
            d4.c(97.5032f, 112.94f, 98.9521f, 115.146f, 100.684f, 117.096f);
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 0, null, esaVar5, "", d4.a);
            esa esaVar6 = new esa(j);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new rn8(103.797f, 120.075f));
            arrayList2.add(new on8(105.945f, 121.821f, 108.372f, 123.237f, 111.001f, 124.247f));
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 0, null, esaVar6, "", arrayList2);
            esa esaVar7 = new esa(j);
            ArrayList arrayList3 = new ArrayList(32);
            arrayList3.add(new rn8(148.0f, 126.0f));
            arrayList3.add(new qn8(154.0f, 132.0f));
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 0, 0, null, esaVar7, "", arrayList3);
            esa esaVar8 = new esa(b2);
            esa esaVar9 = new esa(j);
            ArrayList arrayList4 = new ArrayList(32);
            arrayList4.add(new rn8(153.03f, 131.03f));
            arrayList4.add(new on8(151.138f, 132.923f, 151.138f, 135.992f, 153.03f, 137.884f));
            arrayList4.add(new qn8(164.116f, 148.97f));
            arrayList4.add(new on8(166.008f, 150.862f, 169.077f, 150.862f, 170.97f, 148.97f));
            arrayList4.add(new on8(172.863f, 147.077f, 172.863f, 144.008f, 170.97f, 142.116f));
            arrayList4.add(new qn8(159.885f, 131.03f));
            arrayList4.add(new on8(157.992f, 129.138f, 154.923f, 129.138f, 153.03f, 131.03f));
            arrayList4.add(nn8Var);
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 1, 0, 0, esaVar8, esaVar9, "", arrayList4);
            esa esaVar10 = new esa(j2);
            ArrayList arrayList5 = new ArrayList(32);
            arrayList5.add(new rn8(158.0f, 133.0f));
            arrayList5.add(new qn8(169.0f, 144.0f));
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 0, null, esaVar10, "", arrayList5);
            esa esaVar11 = new esa(b2);
            ArrayList arrayList6 = new ArrayList(32);
            arrayList6.add(new rn8(114.0f, 88.0f));
            arrayList6.add(new on8(114.0f, 99.598f, 123.402f, 109.0f, 135.0f, 109.0f));
            arrayList6.add(new on8(137.278f, 109.0f, 139.472f, 108.637f, 141.526f, 107.966f));
            arrayList6.add(new on8(138.173f, 116.287f, 130.023f, 122.161f, 120.5f, 122.161f));
            arrayList6.add(new on8(107.985f, 122.161f, 97.8394f, 112.015f, 97.8394f, 99.5f));
            arrayList6.add(new on8(97.8394f, 88.1596f, 106.17f, 78.7648f, 117.045f, 77.1011f));
            arrayList6.add(new on8(115.113f, 80.2793f, 114.0f, 84.0097f, 114.0f, 88.0f));
            arrayList6.add(nn8Var);
            zq5Var.c(1.0f, 1.0f, nae.e, 4.0f, nae.e, 1.0f, nae.e, 1, 0, 0, esaVar11, null, "", arrayList6);
            esa esaVar12 = new esa(j);
            ArrayList arrayList7 = new ArrayList(32);
            arrayList7.add(new rn8(121.0f, 81.0f));
            arrayList7.add(new on8(119.727f, 81.0f, 118.482f, 81.1253f, 117.279f, 81.3642f));
            arrayList7.add(new rn8(113.645f, 82.4761f));
            arrayList7.add(new on8(106.804f, 85.3508f, 102.0f, 92.1144f, 102.0f, 100.0f));
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 0, null, esaVar12, "", arrayList7);
            esa esaVar13 = new esa(j);
            hy hyVar = new hy(2);
            hyVar.i(174.176f, 99.7773f);
            hyVar.e(166.0f);
            hyVar.i(180.5f, 92.0f);
            hyVar.e(163.324f);
            hyVar.e(180.5f);
            hyVar.b();
            hyVar.i(187.5f, 92.0f);
            hyVar.e(185.279f);
            hyVar.e(187.5f);
            hyVar.b();
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 1, null, esaVar13, "", hyVar.a);
            esa esaVar14 = new esa(j);
            hy hyVar2 = new hy(2);
            hyVar2.i(84.1758f, 121.777f);
            hyVar2.e(76.0f);
            hyVar2.i(79.5f, 113.0f);
            hyVar2.e(62.3242f);
            hyVar2.e(79.5f);
            hyVar2.b();
            hyVar2.i(56.5f, 113.0f);
            hyVar2.e(52.2788f);
            hyVar2.e(56.5f);
            hyVar2.b();
            zq5Var.c(1.0f, 1.0f, 2.5f, 4.0f, nae.e, 1.0f, nae.e, 0, 1, 1, null, esaVar14, "", hyVar2.a);
            P = zq5Var.e();
            rv4Var.o0(P);
        }
        return (ar5) P;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(int r4, int r5, defpackage.n42 r6, java.lang.String r7) {
        /*
            boolean r0 = r6 instanceof defpackage.q20
            if (r0 == 0) goto L13
            r0 = r6
            q20 r0 = (defpackage.q20) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            q20 r0 = new q20
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.c
            r2 = 2
            if (r1 == 0) goto L3b
            r4 = 1
            if (r1 == r4) goto L33
            if (r1 != r2) goto L2c
            m20 r4 = r0.a
            l66 r4 = (defpackage.l66) r4
            defpackage.hre.r(r6)
            return r4
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L33:
            m20 r4 = r0.a
            u56 r4 = (defpackage.u56) r4
            defpackage.hre.r(r6)
            return r4
        L3b:
            defpackage.hre.r(r6)
            l66 r6 = new l66
            r6.<init>(r4, r7, r5)
            r0.a = r6
            r0.c = r2
            java.lang.Object r4 = r6.i(r0)
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L50
            return r5
        L50:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.owe.H(int, int, n42, java.lang.String):java.lang.Object");
    }

    public static final void I(StringBuilder sb, String str, String str2) {
        str.getClass();
        str2.getClass();
        sb.append((CharSequence) ("-> " + str + ": " + str2)).append('\n');
    }

    public static final void J(StringBuilder sb, Set set, List list) {
        set.getClass();
        list.getClass();
        for (Map.Entry entry : sl1.u0(sl1.C0(set), new pa5(11))) {
            String str = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                I(sb, str, sl1.i0(list2, "; ", null, null, null, 62));
            } else {
                throw rs8.f(it);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (s(r9, r1, r8, r0) == r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
        if (r7.d(r8, r0) != r6) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
        if (r7.d(r8, r0) == r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
        return r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K(defpackage.xe5 r7, defpackage.oh5 r8, defpackage.n42 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.jx6
            if (r0 == 0) goto L13
            r0 = r9
            jx6 r0 = (defpackage.jx6) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jx6 r0 = new jx6
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.d
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            n82 r6 = defpackage.n82.a
            if (r1 == 0) goto L48
            if (r1 == r4) goto L3b
            if (r1 == r3) goto L37
            if (r1 == r2) goto L37
            r7 = 4
            if (r1 == r7) goto L33
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r5
        L33:
            defpackage.hre.r(r9)
            throw r5
        L37:
            defpackage.hre.r(r9)
            goto L97
        L3b:
            java.lang.StringBuilder r7 = r0.b
            xe5 r8 = r0.a
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L45
            r9 = r7
            r7 = r8
            goto L65
        L45:
            r9 = r7
            r7 = r8
            goto L7e
        L48:
            defpackage.hre.r(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            e32 r1 = defpackage.oue.z(r8)     // Catch: java.lang.Throwable -> L7e
            s11 r8 = r8.b()     // Catch: java.lang.Throwable -> L7e
            r0.a = r7     // Catch: java.lang.Throwable -> L7e
            r0.b = r9     // Catch: java.lang.Throwable -> L7e
            r0.d = r4     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r8 = s(r9, r1, r8, r0)     // Catch: java.lang.Throwable -> L7e
            if (r8 != r6) goto L65
            goto L96
        L65:
            java.lang.String r8 = r9.toString()
            java.lang.CharSequence r8 = defpackage.k4b.N0(r8)
            java.lang.String r8 = r8.toString()
            r0.a = r5
            r0.b = r5
            r0.d = r3
            java.lang.Object r7 = r7.d(r8, r0)
            if (r7 != r6) goto L97
            goto L96
        L7e:
            java.lang.String r8 = r9.toString()
            java.lang.CharSequence r8 = defpackage.k4b.N0(r8)
            java.lang.String r8 = r8.toString()
            r0.a = r5
            r0.b = r5
            r0.d = r2
            java.lang.Object r7 = r7.d(r8, r0)
            if (r7 != r6) goto L97
        L96:
            return r6
        L97:
            pvc r7 = defpackage.pvc.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.owe.K(xe5, oh5, n42):java.lang.Object");
    }

    public static final void L(StringBuilder sb, oh5 oh5Var, ew6 ew6Var, List list) {
        ew6Var.getClass();
        list.getClass();
        if (ew6Var.a) {
            sb.append("RESPONSE: " + oh5Var.e());
            sb.append('\n');
            sb.append("METHOD: " + oh5Var.y0().c().getMethod());
            sb.append('\n');
            sb.append("FROM: " + oh5Var.y0().c().getUrl());
            sb.append('\n');
        }
        if (ew6Var.b) {
            sb.append("COMMON HEADERS");
            sb.append('\n');
            J(sb, oh5Var.a().a(), list);
        }
    }

    public static final do1 M(yf0 yf0Var, yf0 yf0Var2, rv4 rv4Var, int i) {
        boolean z;
        yf0Var.getClass();
        yf0Var2.getClass();
        boolean z2 = false;
        if ((((i & 14) ^ 6) > 4 && rv4Var.f(yf0Var)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        if ((((i & Token.ASSIGN_MOD) ^ 48) > 32 && rv4Var.f(yf0Var2)) || (i & 48) == 32) {
            z2 = true;
        }
        boolean z3 = z | z2;
        Object P = rv4Var.P();
        if (z3 || P == ax1.a) {
            P = new do1(yf0Var, yf0Var2);
            rv4Var.o0(P);
        }
        return (do1) P;
    }

    public static final long N(rk9 rk9Var) {
        float f2 = rk9Var.c - rk9Var.a;
        float f3 = rk9Var.d - rk9Var.b;
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final v72 O(rv4 rv4Var) {
        return v72.d(((h27) rv4Var.j(j27.a)).c.b, new sg3(nae.e), null, null, new sg3(nae.e), 6);
    }

    public static final v72 P(rv4 rv4Var) {
        return v72.d(((h27) rv4Var.j(j27.a)).c.b, null, new sg3(nae.e), new sg3(nae.e), null, 9);
    }

    public static final long Q(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) * intBitsToFloat) << 32);
    }

    public static final qo3 R(q71 q71Var) {
        q71Var.getClass();
        if (q71Var.a) {
            return qo3.k;
        }
        boolean z = q71Var.b;
        if (z && q71Var.c) {
            return qo3.j;
        }
        return new qo3(true, true, true, true, true, true, true, z, q71Var.c);
    }

    public static final void S(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static final void a(qq0 qq0Var, boolean z, xt4 xt4Var, vt4 vt4Var, wza wzaVar, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        qq0 qq0Var2;
        rv4 rv4Var2;
        rv4Var.g0(-465004524);
        if (rv4Var.d(qq0Var.ordinal())) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var.h(vt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var.f(wzaVar)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i11 & 1, z2)) {
            kq7 kq7Var = kq7.a;
            nq7 f2 = pna.f(kq7Var, 1.0f);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var, 48);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, f2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            cvb.c(yqe.A((y3b) o3b.u.getValue(), rv4Var), new we6(1.0f, true), 0L, null, 0L, null, dq4.D, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((h27) rv4Var.j(j27.a)).b.h, rv4Var, 1572864, 24960, 110524);
            rv4Var2 = rv4Var;
            int i12 = i11 >> 3;
            int i13 = i11 >> 6;
            k(z, vt4Var, rv4Var2, (i12 & 14) | (i13 & Token.ASSIGN_MOD));
            xbe.i(rv4Var2, pna.s(kq7Var, 4.0f));
            int i14 = (i11 & 14) | (i12 & Token.ASSIGN_MOD) | (i13 & 896);
            qq0Var2 = qq0Var;
            j(qq0Var2, xt4Var, wzaVar, rv4Var2, i14);
            rv4Var2.q(true);
        } else {
            qq0Var2 = qq0Var;
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new b62(qq0Var2, z, xt4Var, vt4Var, wzaVar, i);
        }
    }

    public static final void b(vl6 vl6Var, qq0 qq0Var, wza wzaVar, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        wza wzaVar2;
        long j;
        float f2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-750555411);
        if (rv4Var2.f(vl6Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var2.d(qq0Var.ordinal())) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var2.f(wzaVar)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var2.h(vt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i9 & 1, z)) {
            long j2 = vl6Var.v;
            long j3 = vl6Var.w;
            long j4 = j2 + j3;
            int ordinal = qq0Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        j = j3;
                    } else {
                        xk5.o();
                        return;
                    }
                } else {
                    j = j2;
                }
            } else {
                j = j4;
            }
            if (j4 < 1) {
                j4 = 1;
            }
            float f3 = (float) j4;
            float f4 = ((float) j2) / f3;
            if (f4 < 0.001f) {
                f4 = 0.001f;
            }
            float f5 = ((float) j3) / f3;
            if (f5 < 0.001f) {
                f2 = 0.001f;
            } else {
                f2 = f5;
            }
            kq7 kq7Var = kq7.a;
            nq7 k = tte.k(pna.f(kq7Var, 1.0f), r0f.z(rv4Var2).c);
            long g2 = rm1.g(r0f.y(rv4Var2), 4.0f);
            ba5 ba5Var = lre.g;
            nq7 y = zbe.y(q1d.t(1, vt4Var, rv4Var2, nmd.v(k, g2, ba5Var), false), 12.0f);
            mk0 mk0Var = kh5.G;
            dz dzVar = lz.a;
            gv9 a2 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, y);
            rw1.k.getClass();
            float f6 = f2;
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            float f7 = f4;
            do5.c(vl6Var.a, t(vl6Var), vl6Var.d, vl6Var.j, r0f.d, tte.k(pna.h(pna.s(kq7Var, 42.0f), 58.0f), r0f.z(rv4Var2).b), rv4Var2, 24576);
            xbe.i(rv4Var2, pna.s(kq7Var, 10.0f));
            jv9 jv9Var = jv9.a;
            nq7 a3 = jv9Var.a(1.0f, kq7Var, true);
            xn1 a4 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, a3);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a4);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            nq7 f8 = pna.f(kq7Var, 1.0f);
            mk0 mk0Var2 = kh5.F;
            gv9 a5 = ev9.a(dzVar, mk0Var2, rv4Var2, 48);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, f8);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a5);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p3);
            cvb.c(t(vl6Var), jv9Var.a(1.0f, kq7Var, true), 0L, null, 0L, null, dq4.C, null, 0L, null, null, 0L, 2, false, 2, 0, null, r0f.A(rv4Var2).j, rv4Var, 1572864, 24960, 110524);
            xbe.i(rv4Var, pna.s(kq7Var, 8.0f));
            cvb.c(B(j), null, 0L, null, 0L, null, dq4.D, null, 0L, null, null, 0L, 0, false, 1, 0, null, r0f.A(rv4Var).i, rv4Var, 1572864, 24576, 114622);
            rs8.u(rv4Var, true, kq7Var, 2.0f, rv4Var);
            nq7 f9 = pna.f(kq7Var, 1.0f);
            gv9 a6 = ev9.a(new hz(12.0f, true, new vs(2)), mk0Var2, rv4Var, 6);
            int hashCode4 = Long.hashCode(rv4Var.T);
            xt8 l4 = rv4Var.l();
            nq7 p4 = lye.p(rv4Var, f9);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a6);
            jce.F(npVar2, rv4Var, l4);
            s21.t(hashCode4, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p4);
            String o = eub.o(yqe.A((y3b) o3b.m.getValue(), rv4Var), " ", B(j2));
            nq7 a7 = jv9Var.a(1.0f, kq7Var, true);
            oyb oybVar = r0f.A(rv4Var).l;
            long j5 = wzaVar.g;
            long j6 = wzaVar.h;
            cvb.c(o, a7, zl1.b(0.85f, j5), null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 1, 0, null, oybVar, rv4Var, 0, 24960, 109560);
            cvb.c(eub.o(yqe.A((y3b) o3b.k.getValue(), rv4Var), " ", B(j3)), jv9Var.a(1.0f, kq7Var, true), zl1.b(0.85f, j6), null, 0L, null, null, null, 0L, null, new tlb(6), 0L, 2, false, 1, 0, null, r0f.A(rv4Var).l, rv4Var, 0, 24960, 109560);
            rv4Var2 = rv4Var;
            rs8.u(rv4Var2, true, kq7Var, 8.0f, rv4Var2);
            wzaVar2 = wzaVar;
            nq7 v = nmd.v(tte.k(pna.h(pna.f(kq7Var, 1.0f), 8.0f), uu9.a), wzaVar2.i, ba5Var);
            gv9 a8 = ev9.a(dzVar, mk0Var2, rv4Var2, 0);
            int hashCode5 = Long.hashCode(rv4Var2.T);
            xt8 l5 = rv4Var2.l();
            nq7 p5 = lye.p(rv4Var2, v);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a8);
            jce.F(npVar2, rv4Var2, l5);
            s21.t(hashCode5, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p5);
            fu0.a(nmd.v(tte.k(pna.c(jv9Var.a(f7, kq7Var, true), 1.0f), O(rv4Var2)), wzaVar2.g, ba5Var), rv4Var2, 0);
            fu0.a(nmd.v(tte.k(pna.c(pna.s(kq7Var, 2.0f), 1.0f), r0f.z(rv4Var2).a), wzaVar2.j, ba5Var), rv4Var2, 0);
            fu0.a(nmd.v(tte.k(pna.c(jv9Var.a(f6, kq7Var, true), 1.0f), P(rv4Var2)), j6, ba5Var), rv4Var2, 0);
            rv4Var2.q(true);
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            wzaVar2 = wzaVar;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new rj7(vl6Var, qq0Var, wzaVar2, vt4Var, i, 8);
        }
    }

    public static final void c(d0b d0bVar, wza wzaVar, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        zx1 zx1Var;
        int i3;
        int i4;
        rv4Var.g0(697648001);
        if ((i & 6) == 0) {
            if (rv4Var.f(d0bVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(wzaVar)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            long j = d0bVar.a;
            long j2 = d0bVar.b;
            long j3 = j + j2;
            if (j3 < 1) {
                j3 = 1;
            }
            float f2 = (float) j3;
            float f3 = ((float) j) / f2;
            float f4 = 0.001f;
            if (f3 < 0.001f) {
                f3 = 0.001f;
            }
            float f5 = ((float) j2) / f2;
            if (f5 >= 0.001f) {
                f4 = f5;
            }
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            kq7 kq7Var = kq7.a;
            nq7 p = lye.p(rv4Var, kq7Var);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var2);
            } else {
                rv4Var.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            nq7 k = tte.k(pna.h(pna.f(kq7Var, 1.0f), 16.0f), uu9.a);
            long j4 = wzaVar.i;
            ba5 ba5Var = lre.g;
            nq7 v = nmd.v(k, j4, ba5Var);
            mk0 mk0Var = kh5.F;
            gv9 a3 = ev9.a(lz.a, mk0Var, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, v);
            rv4Var.i0();
            if (rv4Var.S) {
                zx1Var = zx1Var2;
                rv4Var.k(zx1Var);
            } else {
                zx1Var = zx1Var2;
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a3);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            if (f3 <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (f3 > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            }
            fu0.a(nmd.v(tte.k(pna.c(new we6(f3, true), 1.0f), O(rv4Var)), wzaVar.g, ba5Var), rv4Var, 0);
            fu0.a(nmd.v(tte.k(pna.c(pna.s(kq7Var, 2.0f), 1.0f), ((h27) rv4Var.j(j27.a)).c.a), wzaVar.j, ba5Var), rv4Var, 0);
            if (f4 <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (f4 > Float.MAX_VALUE) {
                f4 = Float.MAX_VALUE;
            }
            fu0.a(nmd.v(tte.k(pna.c(new we6(f4, true), 1.0f), P(rv4Var)), wzaVar.h, ba5Var), rv4Var, 0);
            rs8.u(rv4Var, true, kq7Var, 12.0f, rv4Var);
            nq7 f6 = pna.f(kq7Var, 1.0f);
            gv9 a4 = ev9.a(lz.g, mk0Var, rv4Var, 6);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, f6);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a4);
            jce.F(npVar2, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p3);
            l(yqe.A((y3b) o3b.m.getValue(), rv4Var), B(d0bVar.a), wzaVar.g, rv4Var, 0);
            l(yqe.A((y3b) o3b.k.getValue(), rv4Var), B(j2), wzaVar.h, rv4Var, 0);
            rv4Var.q(true);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new gk7(d0bVar, wzaVar, i, 28);
        }
    }

    public static final void d(boolean z, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-362875794);
        if (rv4Var2.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var2.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i5 & 1, z2)) {
            nq7 f2 = pna.f(kq7.a, 1.0f);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, f2);
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
            cvb.c(yqe.A((y3b) o3b.n.getValue(), rv4Var2), new we6(1.0f, true), 0L, null, 0L, null, dq4.D, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.h, rv4Var, 1572864, 0, 131004);
            rv4Var2 = rv4Var;
            k(z, vt4Var, rv4Var2, i5 & Token.ELSE);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new hd1(z, vt4Var, i, 2);
        }
    }

    public static final void e(vl6 vl6Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        vl6 vl6Var2;
        int i4;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1328824176);
        if (rv4Var2.f(vl6Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i6 & 1, z)) {
            kq7 kq7Var = kq7.a;
            nq7 y = zbe.y(q1d.t(1, vt4Var, rv4Var2, nmd.v(tte.k(pna.f(kq7Var, 1.0f), r0f.z(rv4Var2).c), rm1.g(r0f.y(rv4Var2), 4.0f), lre.g), false), 12.0f);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
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
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            do5.c(vl6Var.a, t(vl6Var), vl6Var.d, vl6Var.j, r0f.d, tte.k(pna.h(pna.s(kq7Var, 42.0f), 58.0f), r0f.z(rv4Var2).b), rv4Var2, 24576);
            we6 d2 = rs8.d(kq7Var, 10.0f, rv4Var2, 1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, d2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            cvb.c(t(vl6Var), null, 0L, null, 0L, null, dq4.C, null, 0L, null, null, 0L, 2, false, 2, 0, null, r0f.A(rv4Var2).j, rv4Var, 1572864, 24960, 110526);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            vl6Var2 = vl6Var;
            cvb.c(yqe.B((y3b) o3b.h.getValue(), new Object[]{Integer.valueOf(vl6Var2.u)}, rv4Var), null, zl1.b(0.6f, r0f.y(rv4Var).q), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).l, rv4Var, 0, 0, 131066);
            rv4Var2 = rv4Var;
            i4 = 1;
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            vl6Var2 = vl6Var;
            i4 = 1;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new vfa(vl6Var2, vt4Var, i, i4);
        }
    }

    public static final void f(String str, String str2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        String str3 = str;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(931933476);
        if (rv4Var2.f(str3)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i6 & 1, z)) {
            xn1 a2 = wn1.a(lz.c, kh5.J, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            kq7 kq7Var = kq7.a;
            nq7 p = lye.p(rv4Var2, kq7Var);
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
            tza tzaVar = j27.a;
            cvb.c(str2, null, 0L, null, 0L, null, dq4.D, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.f, rv4Var, ((i6 >> 3) & 14) | 1572864, 0, 131006);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            str3 = str;
            cvb.c(str3, null, zl1.b(0.6f, ((h27) rv4Var.j(tzaVar)).a.q), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.o, rv4Var, i6 & 14, 0, 131066);
            rv4Var2 = rv4Var;
            i4 = 1;
            rv4Var2.q(true);
        } else {
            i4 = 1;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ui7(str3, str2, i, i4);
        }
    }

    public static final void g(c0b c0bVar, kj6 kj6Var, vt4 vt4Var, vt4 vt4Var2, xt4 xt4Var, wza wzaVar, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        hz hzVar;
        rv4Var.g0(808712578);
        if (rv4Var.f(c0bVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (rv4Var.f(kj6Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (rv4Var.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i10 = i9 | i4;
        if (rv4Var.h(vt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if (rv4Var.h(xt4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if (rv4Var.f(wzaVar)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i13 = i12 | i7;
        boolean z5 = true;
        if ((74899 & i13) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i13 & 1, z)) {
            ze4 ze4Var = pna.c;
            th8 h = zbe.h(2, 12.0f);
            hz hzVar2 = new hz(12.0f, true, new vs(2));
            if ((i13 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((458752 & i13) == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z6 = z2 | z3;
            if ((i13 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = z6 | z4;
            if ((57344 & i13) != 16384) {
                z5 = false;
            }
            boolean z8 = z7 | z5;
            Object P = rv4Var.P();
            if (!z8 && P != ax1.a) {
                hzVar = hzVar2;
            } else {
                hzVar = hzVar2;
                hq hqVar = new hq(27, xt4Var, c0bVar, wzaVar, vt4Var2);
                rv4Var.o0(hqVar);
                P = hqVar;
            }
            jce.d(ze4Var, kj6Var, h, false, hzVar, null, null, false, null, (xt4) P, rv4Var, (i13 & Token.ASSIGN_MOD) | 24966, 488);
            ej6.c(kj6Var, 3, vt4Var, rv4Var, ((i13 >> 3) & 14) | 48 | (i13 & 896), 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new bn7(c0bVar, kj6Var, vt4Var, vt4Var2, xt4Var, wzaVar, i);
        }
    }

    public static final void h(final long j, final long j2, final long j3, final wza wzaVar, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        rv4Var.g0(1670243886);
        if (rv4Var.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.e(j2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.e(j3)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var.f(wzaVar)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            nq7 y = zbe.y(nmd.v(tte.k(pna.f(kq7.a, 1.0f), ((h27) rv4Var.j(j27.a)).c.d), wzaVar.e, lre.g), 14.0f);
            gv9 a2 = ev9.a(lz.f, kh5.F, rv4Var, 6);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, y);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            f(yqe.A((y3b) o3b.v.getValue(), rv4Var), String.valueOf(j), rv4Var, 0);
            f(yqe.A((y3b) o3b.w.getValue(), rv4Var), String.valueOf(j2), rv4Var, 0);
            f(yqe.A((y3b) o3b.i.getValue(), rv4Var), String.valueOf(j3), rv4Var, 0);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(j, j2, j3, wzaVar, i) { // from class: zza
                public final /* synthetic */ long a;
                public final /* synthetic */ long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ wza d;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p2 = xoe.p(1);
                    owe.h(this.a, this.b, this.c, this.d, (rv4) obj, p2);
                    return pvc.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final java.lang.String r46, defpackage.d0b r47, defpackage.wza r48, final defpackage.vza r49, final int r50, boolean r51, boolean r52, defpackage.rv4 r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 1589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.owe.i(java.lang.String, d0b, wza, vza, int, boolean, boolean, rv4, int, int):void");
    }

    public static final void j(qq0 qq0Var, xt4 xt4Var, wza wzaVar, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        long j;
        long b2;
        float f2;
        boolean z3;
        boolean z4;
        boolean z5;
        y3b y3bVar;
        dq4 dq4Var;
        int i3;
        int i4;
        rv4 rv4Var2 = rv4Var;
        ba5 ba5Var = lre.g;
        rv4Var2.g0(1112443461);
        if (rv4Var2.d(qq0Var.ordinal())) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if ((i & 48) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i5 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.f(wzaVar)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i5 |= i3;
        }
        int i6 = i5;
        boolean z6 = true;
        boolean z7 = false;
        if ((i6 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i6 & 1, z)) {
            su9 su9Var = uu9.a;
            kq7 kq7Var = kq7.a;
            nq7 y = zbe.y(nmd.v(tte.k(kq7Var, su9Var), wzaVar.k, ba5Var), 4.0f);
            gv9 a2 = ev9.a(new hz(4.0f, true, new vs(2)), kh5.F, rv4Var2, 6);
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
            rv4Var2.e0(-1240524204);
            qu3 qu3Var = qq0.c;
            qu3Var.getClass();
            b2 b2Var = new b2(qu3Var, 0);
            while (b2Var.hasNext()) {
                qq0 qq0Var2 = (qq0) b2Var.next();
                if (qq0Var == qq0Var2) {
                    z2 = z6;
                } else {
                    z2 = z7;
                }
                if (z2) {
                    rv4Var2.e0(-210927245);
                    j = zl1.b(0.18f, ((h27) rv4Var2.j(j27.a)).a.a);
                    rv4Var2.q(z7);
                } else {
                    rv4Var2.e0(-210830153);
                    rv4Var2.q(z7);
                    j = zl1.h;
                }
                yya a3 = wma.a(j, tte.v(nae.e, 400.0f, 5, null), rv4Var2, 48, 12);
                if (z2) {
                    rv4Var2.e0(-210585625);
                    b2 = ((h27) rv4Var2.j(j27.a)).a.a;
                    rv4Var2.q(false);
                } else {
                    rv4Var2.e0(-210506575);
                    b2 = zl1.b(0.72f, ((h27) rv4Var2.j(j27.a)).a.q);
                    rv4Var2.q(false);
                }
                yya a4 = wma.a(b2, tte.v(nae.e, 400.0f, 5, null), rv4Var2, 48, 12);
                if (z2) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.96f;
                }
                yya b3 = nq.b(f2, tte.v(nae.e, 400.0f, 5, null), null, rv4Var, 48, 28);
                nq7 v = nmd.v(tte.k(kq7Var, uu9.a), ((zl1) a3.getValue()).a, ba5Var);
                if ((i6 & Token.ASSIGN_MOD) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean d2 = z3 | rv4Var.d(qq0Var2.ordinal());
                Object P = rv4Var.P();
                lh9 lh9Var = ax1.a;
                if (!d2 && P != lh9Var) {
                    z4 = false;
                } else {
                    z4 = false;
                    P = new a0b(0, xt4Var, qq0Var2);
                    rv4Var.o0(P);
                }
                nq7 z8 = zbe.z(q1d.t(1, (vt4) P, rv4Var, v, z4), 10.0f, 6.0f);
                b37 d3 = fu0.d(kh5.e, z4);
                int hashCode2 = Long.hashCode(rv4Var.T);
                xt8 l2 = rv4Var.l();
                nq7 p2 = lye.p(rv4Var, z8);
                rw1.k.getClass();
                zx1 zx1Var2 = qw1.b;
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(zx1Var2);
                } else {
                    rv4Var.r0();
                }
                jce.F(qw1.f, rv4Var, d3);
                jce.F(qw1.e, rv4Var, l2);
                jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode2));
                jce.C(qw1.h, rv4Var);
                jce.F(qw1.d, rv4Var, p2);
                int ordinal = qq0Var2.ordinal();
                if (ordinal != 0) {
                    z5 = true;
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            y3bVar = (y3b) o3b.o.getValue();
                        } else {
                            xk5.o();
                            return;
                        }
                    } else {
                        y3bVar = (y3b) o3b.p.getValue();
                    }
                } else {
                    z5 = true;
                    y3bVar = (y3b) o3b.q.getValue();
                }
                String A = yqe.A(y3bVar, rv4Var);
                oyb oybVar = ((h27) rv4Var.j(j27.a)).b.n;
                long j2 = ((zl1) a4.getValue()).a;
                if (z2) {
                    dq4Var = dq4.C;
                } else {
                    dq4Var = dq4.f;
                }
                boolean f3 = rv4Var.f(b3);
                Object P2 = rv4Var.P();
                if (f3 || P2 == lh9Var) {
                    P2 = new jt0(b3, 9);
                    rv4Var.o0(P2);
                }
                boolean z9 = z5;
                cvb.c(A, axe.k(kq7Var, (xt4) P2), j2, null, 0L, null, dq4Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 0, 0, 131000);
                rv4Var2 = rv4Var;
                rv4Var2.q(z9);
                z7 = false;
                z6 = z9;
                b2Var = b2Var;
                kq7Var = kq7Var;
                i6 = i6;
            }
            rv4Var2.q(z7);
            rv4Var2.q(z6);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new va(qq0Var, xt4Var, wzaVar, i, 26);
        }
    }

    public static final void k(boolean z, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        float f2;
        long b2;
        int i3;
        int i4;
        rv4Var.g0(-2034254234);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(vt4Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            if (z) {
                f2 = 0.0f;
            } else {
                f2 = 180.0f;
            }
            yya b3 = nq.b(f2, tte.v(nae.e, 400.0f, 5, null), null, rv4Var, 48, 28);
            ar5 c2 = rp5.c((wk3) rk3.e.getValue(), rv4Var, 0);
            if (!z) {
                rv4Var.e0(-708186515);
                b2 = ((h27) rv4Var.j(j27.a)).a.a;
            } else {
                rv4Var.e0(-708184936);
                b2 = zl1.b(0.6f, ((h27) rv4Var.j(j27.a)).a.q);
            }
            rv4Var.q(false);
            nq7 y = zbe.y(lbe.f(15, vt4Var, tte.k(pna.n(kq7.a, 32.0f), uu9.a), null, false), 4.0f);
            boolean f3 = rv4Var.f(b3);
            Object P = rv4Var.P();
            if (f3 || P == ax1.a) {
                P = new jt0(b3, 8);
                rv4Var.o0(P);
            }
            nk5.a(c2, null, axe.k(y, (xt4) P), b2, rv4Var, 48, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new pf0(z, vt4Var, i, 2);
        }
    }

    public static final void l(String str, String str2, long j, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        rv4 rv4Var2;
        rv4Var.g0(-1281885898);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.e(j)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var, 48);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            kq7 kq7Var = kq7.a;
            nq7 p = lye.p(rv4Var, kq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            fu0.a(nmd.v(tte.k(pna.n(kq7Var, 8.0f), uu9.a), j, lre.g), rv4Var, 0);
            xbe.i(rv4Var, pna.s(kq7Var, 6.0f));
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, kq7Var);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a3);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            tza tzaVar = j27.a;
            cvb.c(str, null, zl1.b(0.55f, ((h27) rv4Var.j(tzaVar)).a.q), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.o, rv4Var, i7 & 14, 0, 131066);
            rv4Var2 = rv4Var;
            cvb.c(str2, null, 0L, null, 0L, null, dq4.C, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.i, rv4Var, ((i7 >> 3) & 14) | 1572864, 0, 131006);
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new g01(i, j, str, str2);
        }
    }

    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v36 */
    public static final void m(List list, wza wzaVar, boolean z, vza vzaVar, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        Long l;
        float f2;
        boolean z3;
        boolean z4;
        long j;
        float f3;
        k2a k2aVar;
        nq7 s;
        Iterator it;
        gd1 gd1Var;
        np npVar;
        ba5 ba5Var;
        float f4;
        np npVar2;
        kg kgVar;
        np npVar3;
        long j2;
        ?? r4;
        ba5 ba5Var2;
        float f5;
        long j3;
        gd1 gd1Var2;
        float f6;
        boolean z5;
        String str;
        int i3;
        int i4;
        int i5;
        boolean h;
        int i6;
        List list2 = list;
        boolean z6 = z;
        rv4 rv4Var2 = rv4Var;
        ba5 ba5Var3 = lre.g;
        rv4Var2.g0(-1768796967);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var2.f(list2);
            } else {
                h = rv4Var2.h(list2);
            }
            if (h) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(wzaVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.g(z6)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.d(vzaVar.ordinal())) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i2 & 1, z2)) {
            Iterator it2 = list2.iterator();
            if (!it2.hasNext()) {
                l = null;
            } else {
                Long valueOf = Long.valueOf(((gd1) it2.next()).a());
                while (it2.hasNext()) {
                    Long valueOf2 = Long.valueOf(((gd1) it2.next()).a());
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                }
                l = valueOf;
            }
            long j4 = 1;
            if (l != null) {
                long longValue = l.longValue();
                if (longValue >= 1) {
                    j4 = longValue;
                }
            }
            if (list2.size() == 7) {
                f2 = 0.52f;
            } else {
                f2 = 0.72f;
            }
            k2a u = rte.u(rv4Var2);
            r13 r13Var = (r13) rv4Var2.j(dy1.h);
            Integer valueOf3 = Integer.valueOf(u.f.h());
            if ((i2 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !rv4Var2.h(list2))) {
                z4 = false;
            } else {
                z4 = true;
            }
            boolean f7 = z4 | z3 | rv4Var2.f(r13Var) | rv4Var2.f(u);
            Object P = rv4Var2.P();
            if (!f7 && P != ax1.a) {
                f3 = f2;
                j = j4;
                k2aVar = u;
            } else {
                j = j4;
                f3 = f2;
                k2aVar = u;
                z45 z45Var = new z45(vzaVar, list2, r13Var, k2aVar, (m42) null, 23);
                list2 = list2;
                rv4Var2.o0(z45Var);
                P = z45Var;
            }
            yte.i(list2, vzaVar, valueOf3, (lu4) P, rv4Var2);
            kq7 kq7Var = kq7.a;
            float f8 = 1.0f;
            nq7 h2 = pna.h(rte.q(pna.f(kq7Var, 1.0f), k2aVar, 14), 146.0f);
            gv9 a2 = ev9.a(new hz(6.0f, true, new vs(2)), kh5.H, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, h2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l2);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            rv4Var2.e0(711450648);
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                gd1 gd1Var3 = (gd1) it3.next();
                if (list2.size() <= 7) {
                    s = new we6(f8, true);
                } else {
                    s = pna.s(kq7Var, 26.0f);
                }
                xn1 a3 = wn1.a(lz.c, kh5.J, rv4Var2, 48);
                int hashCode2 = Long.hashCode(rv4Var2.T);
                xt8 l3 = rv4Var2.l();
                nq7 p2 = lye.p(rv4Var2, s);
                rw1.k.getClass();
                zx1 zx1Var2 = qw1.b;
                rv4Var2.i0();
                if (rv4Var2.S) {
                    rv4Var2.k(zx1Var2);
                } else {
                    rv4Var2.r0();
                }
                np npVar4 = qw1.f;
                jce.F(npVar4, rv4Var2, a3);
                np npVar5 = qw1.e;
                jce.F(npVar5, rv4Var2, l3);
                Integer valueOf4 = Integer.valueOf(hashCode2);
                np npVar6 = qw1.g;
                jce.F(npVar6, rv4Var2, valueOf4);
                kg kgVar2 = qw1.h;
                jce.C(kgVar2, rv4Var2);
                np npVar7 = qw1.d;
                jce.F(npVar7, rv4Var2, p2);
                if (z6) {
                    rv4Var2.e0(454383454);
                    ba5 ba5Var4 = ba5Var3;
                    long a4 = gd1Var3.a();
                    if (a4 == 0 || j <= 0) {
                        it = it3;
                        str = "0m";
                    } else {
                        int z7 = k27.z(a4 / 60000.0d);
                        if (z7 < 60) {
                            str = z7 + "m";
                            it = it3;
                        } else {
                            it = it3;
                            str = (z7 / 60) + "h " + (z7 % 60) + "m";
                        }
                    }
                    tza tzaVar = j27.a;
                    oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.o;
                    long b2 = zl1.b(0.38f, ((h27) rv4Var2.j(tzaVar)).a.q);
                    f4 = f3;
                    kgVar = kgVar2;
                    String str2 = str;
                    npVar2 = npVar5;
                    npVar = npVar7;
                    r4 = 0;
                    gd1Var = gd1Var3;
                    j2 = j;
                    ba5Var = ba5Var4;
                    npVar3 = npVar6;
                    cvb.c(str2, null, b2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 0, 0, 131066);
                    rv4Var2 = rv4Var;
                    hl5.w(kq7Var, 6.0f, rv4Var2, false);
                } else {
                    it = it3;
                    gd1Var = gd1Var3;
                    npVar = npVar7;
                    ba5Var = ba5Var3;
                    f4 = f3;
                    npVar2 = npVar5;
                    kgVar = kgVar2;
                    npVar3 = npVar6;
                    j2 = j;
                    r4 = 0;
                    rv4Var2.e0(454731336);
                    rv4Var2.q(false);
                }
                nq7 b3 = zn1.b(pna.f(kq7Var, 1.0f), 1.0f);
                b37 d2 = fu0.d(kh5.D, r4);
                int hashCode3 = Long.hashCode(rv4Var2.T);
                xt8 l4 = rv4Var2.l();
                nq7 p3 = lye.p(rv4Var2, b3);
                rv4Var2.i0();
                if (rv4Var2.S) {
                    rv4Var2.k(zx1Var2);
                } else {
                    rv4Var2.r0();
                }
                jce.F(npVar4, rv4Var2, d2);
                jce.F(npVar2, rv4Var2, l4);
                s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
                jce.F(npVar, rv4Var2, p3);
                long j5 = j2;
                float m = dce.m(((float) gd1Var.a()) / ((float) j5), 0.05f, 1.0f);
                if (gd1Var.a() <= 0) {
                    rv4Var2.e0(1616244932);
                    f5 = f4;
                    ba5 ba5Var5 = ba5Var;
                    fu0.a(nmd.v(tte.k(pna.c(pna.f(kq7Var, f5), m), v72.d(((h27) rv4Var2.j(j27.a)).c.c, null, null, new sg3(nae.e), new sg3(nae.e), 3)), wzaVar.i, ba5Var5), rv4Var2, r4);
                    rv4Var2.q(r4);
                    ba5Var2 = ba5Var5;
                    j3 = j5;
                    gd1Var2 = gd1Var;
                    f6 = 1.0f;
                    z5 = true;
                } else {
                    ba5Var2 = ba5Var;
                    f5 = f4;
                    rv4Var2.e0(1616716876);
                    nq7 k = tte.k(pna.c(pna.f(kq7Var, f5), m), v72.d(((h27) rv4Var2.j(j27.a)).c.c, null, null, new sg3(nae.e), new sg3(nae.e), 3));
                    j3 = j5;
                    xn1 a5 = wn1.a(lz.d, kh5.I, rv4Var2, 6);
                    int hashCode4 = Long.hashCode(rv4Var2.T);
                    xt8 l5 = rv4Var2.l();
                    nq7 p4 = lye.p(rv4Var2, k);
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var2);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(npVar4, rv4Var2, a5);
                    jce.F(npVar2, rv4Var2, l5);
                    s21.t(hashCode4, rv4Var2, npVar3, rv4Var2, kgVar);
                    jce.F(npVar, rv4Var2, p4);
                    nq7 f9 = pna.f(kq7Var, 1.0f);
                    gd1Var2 = gd1Var;
                    float a6 = ((float) gd1Var2.d) / ((float) gd1Var2.a());
                    float f10 = 0.001f;
                    if (a6 < 0.001f) {
                        a6 = 0.001f;
                    }
                    fu0.a(nmd.v(zn1.b(f9, a6), wzaVar.h, ba5Var2), rv4Var2, 0);
                    f6 = 1.0f;
                    nq7 f11 = pna.f(kq7Var, 1.0f);
                    float a7 = ((float) gd1Var2.c) / ((float) gd1Var2.a());
                    if (a7 >= 0.001f) {
                        f10 = a7;
                    }
                    fu0.a(nmd.v(zn1.b(f11, f10), wzaVar.g, ba5Var2), rv4Var2, 0);
                    z5 = true;
                    rv4Var2.q(true);
                    rv4Var2.q(false);
                }
                rs8.u(rv4Var2, z5, kq7Var, 8.0f, rv4Var2);
                String str3 = gd1Var2.a;
                tza tzaVar2 = j27.a;
                rv4 rv4Var3 = rv4Var2;
                cvb.c(str3, null, zl1.b(0.58f, ((h27) rv4Var2.j(tzaVar2)).a.q), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((h27) rv4Var2.j(tzaVar2)).b.o, rv4Var3, 0, 24960, 110586);
                rv4Var2 = rv4Var3;
                rv4Var2.q(true);
                list2 = list;
                z6 = z;
                f8 = f6;
                ba5Var3 = ba5Var2;
                j = j3;
                it3 = it;
                f3 = f5;
            }
            rv4Var2.q(false);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u2 = rv4Var2.u();
        if (u2 != null) {
            u2.d = new ta(list, wzaVar, z, vzaVar, i, 4);
        }
    }

    public static final void n(rh8 rh8Var, c0b c0bVar, xt4 xt4Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, xt4 xt4Var2, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        Object obj;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        rv4Var.g0(1535814157);
        if ((i & 6) == 0) {
            if (rv4Var.f(rh8Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(c0bVar)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i9 = 256;
            } else {
                i9 = Token.CASE;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(vt4Var)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            obj = vt4Var2;
            if (rv4Var.h(obj)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        } else {
            obj = vt4Var2;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(vt4Var3)) {
                i6 = 131072;
            } else {
                i6 = Parser.ARGC_LIMIT;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(vt4Var4)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((100663296 & i) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i2 |= i3;
        }
        if ((38347923 & i2) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            pm1 pm1Var = ((h27) rv4Var.j(j27.a)).a;
            boolean f2 = rv4Var.f(pm1Var);
            Object P = rv4Var.P();
            Object obj2 = ax1.a;
            if (f2 || P == obj2) {
                long j = pm1Var.a;
                long j2 = pm1Var.b;
                long j3 = pm1Var.j;
                P = new wza(j, j2, j3, pm1Var.k, pm1Var.r, pm1Var.s, j, j3, rm1.g(pm1Var, 6.0f), pm1Var.p, pm1Var.r);
                rv4Var.o0(P);
            }
            wza wzaVar = (wza) P;
            List B = tl1.B(yqe.A((y3b) o3b.s.getValue(), rv4Var), yqe.A((y3b) o3b.r.getValue(), rv4Var));
            Object P2 = rv4Var.P();
            if (P2 == obj2) {
                P2 = yte.s(rv4Var);
                rv4Var.o0(P2);
            }
            m82 m82Var = (m82) P2;
            sj8 o = jxe.o(0, B.size(), rv4Var, 0, 3);
            kj6 a2 = mj6.a(0, rv4Var, 0, 3);
            kj6 a3 = mj6.a(0, rv4Var, 0, 3);
            nq7 u = mwe.u(nq7Var, false, 6);
            xn1 a4 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, u);
            rw1.k.getClass();
            vt4 vt4Var5 = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var5);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a4);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var, zbe.x(kq7Var, rh8Var));
            nq7 f3 = pna.f(zbe.A(kq7Var, 8.0f, nae.e, 2), 1.0f);
            int k = o.k();
            long j4 = zl1.h;
            d3a.c(k, f3, j4, j4, nae.e, jce.E(1926419575, new dn7(o, 1), rv4Var), pae.b, jce.E(300180087, new vg7(17, B, o, m82Var), rv4Var), rv4Var, 14380464, 0);
            kxe.c(o, pna.c, null, null, 0, nae.e, null, null, false, null, null, null, null, jce.E(-1748246922, new da3(c0bVar, a2, xt4Var, vt4Var, vt4Var3, xt4Var2, wzaVar, a3, obj, vt4Var4, 2), rv4Var), rv4Var, 48, 24576, 16380);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new dr0(rh8Var, c0bVar, xt4Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, xt4Var2, nq7Var, i);
        }
    }

    public static final void o(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4 rv4Var2;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(-497257769);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                f0b f0bVar = (f0b) ((fdd) voe.z(cm9.a(f0b.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                rv4Var2 = rv4Var;
                fxe.h(yqe.A((y3b) k3b.k.getValue(), rv4Var), pna.c, false, jce.E(638658011, new ri9(cz7Var, 10), rv4Var), null, null, jce.E(609554412, new cs1(f0bVar, cz7Var, jsc.z(f0bVar.e, rv4Var), 14), rv4Var), rv4Var2, 1575984, 52);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ri9(cz7Var, i, 11);
        }
    }

    public static final void p(boolean z, final boolean z2, long j, xr xrVar, nq7 nq7Var, final vt4 vt4Var, rv4 rv4Var, int i) {
        boolean z3;
        int i2;
        boolean z4;
        long j2;
        xr xrVar2;
        int i3;
        final long j3;
        final arc x;
        int i4;
        int i5;
        int i6;
        int i7;
        vt4Var.getClass();
        rv4Var.g0(-935284136);
        if ((i & 6) == 0) {
            z3 = z;
            if (rv4Var.g(z3)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            z3 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.g(z2)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            i2 |= Token.CASE;
        }
        int i8 = i2 | 3072;
        if ((i & 24576) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i8 |= i5;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(vt4Var)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i8 |= i4;
        }
        if ((74899 & i8) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (rv4Var.U(i8 & 1, z4)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                i3 = i8 & (-897);
                j3 = j;
                x = xrVar;
            } else {
                i3 = i8 & (-897);
                j3 = ((h27) rv4Var.j(j27.a)).a.q;
                x = tte.x(400, 0, null, 6);
            }
            rv4Var.r();
            eu3 g2 = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new y4(7);
                rv4Var.o0(P);
            }
            eu3 a2 = g2.a(zt3.s((xt4) P));
            lz3 i9 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new y4(7);
                rv4Var.o0(P2);
            }
            rte.c(z3, nq7Var, a2, i9.a(zt3.w((xt4) P2)), null, jce.E(-449546448, new mu4() { // from class: fpb
                @Override // defpackage.mu4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    boolean z5;
                    float f2;
                    rv4 rv4Var2 = (rv4) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((qr) obj).getClass();
                    if ((intValue & 17) != 16) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z5)) {
                        if (z2) {
                            f2 = 1.0f;
                        } else {
                            f2 = 0.0f;
                        }
                        yya b2 = nq.b(f2, x, null, rv4Var2, 0, 28);
                        nq7 n = pna.n(zbe.y(mwe.u(kq7.a, false, 4), 14.0f), 50.0f);
                        su9 su9Var = uu9.a;
                        nq7 k = tte.k(n, su9Var);
                        vt4 vt4Var2 = vt4Var;
                        boolean f3 = rv4Var2.f(vt4Var2);
                        Object P3 = rv4Var2.P();
                        lh9 lh9Var2 = ax1.a;
                        if (f3 || P3 == lh9Var2) {
                            P3 = new umb(9, vt4Var2);
                            rv4Var2.o0(P3);
                        }
                        nq7 t = q1d.t(1, (vt4) P3, rv4Var2, k, false);
                        tza tzaVar = j27.a;
                        nq7 y = zbe.y(nmd.v(st0.d(t, 1.0f, rm1.g(((h27) rv4Var2.j(tzaVar)).a, 6.0f), su9Var), zl1.b(0.95f, rm1.g(((h27) rv4Var2.j(tzaVar)).a, 4.0f)), lre.g), 8.0f);
                        boolean f4 = rv4Var2.f(b2);
                        long j4 = j3;
                        boolean e2 = rv4Var2.e(j4) | f4;
                        Object P4 = rv4Var2.P();
                        if (e2 || P4 == lh9Var2) {
                            P4 = new sk7(j4, b2, 1);
                            rv4Var2.o0(P4);
                        }
                        bce.a(y, (xt4) P4, rv4Var2, 0);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, (i3 & 14) | 200064 | ((i3 >> 9) & Token.ASSIGN_MOD), 16);
            xrVar2 = x;
            j2 = j3;
        } else {
            rv4Var.X();
            j2 = j;
            xrVar2 = xrVar;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ep7(z, z2, j2, xrVar2, nq7Var, vt4Var, i);
        }
    }

    public static final void q(c0b c0bVar, kj6 kj6Var, xt4 xt4Var, vt4 vt4Var, vt4 vt4Var2, xt4 xt4Var2, wza wzaVar, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        hz hzVar;
        rv4Var.g0(156371425);
        if (rv4Var.f(c0bVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (rv4Var.f(kj6Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i11 = i10 | i4;
        if (rv4Var.h(vt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (rv4Var.h(vt4Var2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (rv4Var.h(xt4Var2)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i14 = i13 | i7;
        if (rv4Var.f(wzaVar)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i15 = i8 | i14;
        boolean z6 = false;
        if ((599187 & i15) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i15 & 1, z)) {
            ze4 ze4Var = pna.c;
            th8 h = zbe.h(2, 12.0f);
            hz hzVar2 = new hz(12.0f, true, new vs(2));
            if ((i15 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((3670016 & i15) == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z7 = z2 | z3;
            if ((i15 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z8 = z7 | z4;
            if ((57344 & i15) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z9 = z8 | z5;
            if ((458752 & i15) == 131072) {
                z6 = true;
            }
            boolean z10 = z9 | z6;
            Object P = rv4Var.P();
            if (!z10 && P != ax1.a) {
                hzVar = hzVar2;
            } else {
                hzVar = hzVar2;
                p6 p6Var = new p6(c0bVar, wzaVar, xt4Var, vt4Var2, xt4Var2, 19);
                rv4Var.o0(p6Var);
                P = p6Var;
            }
            jce.d(ze4Var, kj6Var, h, false, hzVar, null, null, false, null, (xt4) P, rv4Var, (i15 & Token.ASSIGN_MOD) | 24966, 488);
            int i16 = i15 >> 3;
            ej6.c(kj6Var, 3, vt4Var, rv4Var, (i16 & 14) | 48 | (i16 & 896), 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new bx(c0bVar, kj6Var, xt4Var, vt4Var, vt4Var2, xt4Var2, wzaVar, i, 9);
        }
    }

    public static final void r(d0b d0bVar, wza wzaVar, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        wza wzaVar2;
        zx1 zx1Var;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1148601631);
        if (rv4Var2.f(d0bVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var2.f(wzaVar)) {
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
        if (rv4Var2.U(i5 & 1, z)) {
            long j = d0bVar.a;
            long j2 = d0bVar.b;
            long j3 = j + j2;
            if (j3 < 1) {
                j3 = 1;
            }
            float f2 = (((float) j) / ((float) j3)) * 360.0f;
            kq7 kq7Var = kq7.a;
            nq7 f3 = pna.f(kq7Var, 1.0f);
            tza tzaVar = j27.a;
            nq7 y = zbe.y(nmd.v(tte.k(f3, ((h27) rv4Var2.j(tzaVar)).c.d), wzaVar.e, lre.g), 14.0f);
            gv9 a2 = ev9.a(new hz(16.0f, true, new vs(2)), kh5.G, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, y);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var2);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            we6 f4 = s21.f(rv4Var2, p, npVar4, 1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, f4);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var2);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            String A = yqe.A((y3b) o3b.U.getValue(), rv4Var2);
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.h;
            dq4 dq4Var = dq4.D;
            cvb.c(A, null, 0L, null, 0L, null, dq4Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 1572864, 0, 131006);
            xbe.i(rv4Var, pna.h(kq7Var, 8.0f));
            wzaVar2 = wzaVar;
            cvb.c(B(j + j2), null, wzaVar.f, null, 0L, null, dq4Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.e, rv4Var, 1572864, 0, 131002);
            rv4Var2 = rv4Var;
            xbe.i(rv4Var2, pna.h(kq7Var, 10.0f));
            gv9 a4 = ev9.a(new hz(16.0f, true, new vs(2)), kh5.F, rv4Var2, 6);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, kq7Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                zx1Var = zx1Var2;
                rv4Var2.k(zx1Var);
            } else {
                zx1Var = zx1Var2;
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a4);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p3);
            l(yqe.A((y3b) o3b.m.getValue(), rv4Var2), B(j), wzaVar2.g, rv4Var2, 0);
            l(yqe.A((y3b) o3b.k.getValue(), rv4Var2), B(j2), wzaVar2.h, rv4Var2, 0);
            rv4Var2.q(true);
            rv4Var2.q(true);
            nq7 n = pna.n(kq7Var, 92.0f);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode4 = Long.hashCode(rv4Var2.T);
            xt8 l4 = rv4Var2.l();
            nq7 p4 = lye.p(rv4Var2, n);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d2);
            jce.F(npVar2, rv4Var2, l4);
            s21.t(hashCode4, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p4);
            ze4 ze4Var = pna.c;
            if ((i5 & Token.ASSIGN_MOD) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean c2 = rv4Var2.c(f2) | z2;
            Object P = rv4Var2.P();
            if (c2 || P == ax1.a) {
                P = new ni3(f2, 3, wzaVar2);
                rv4Var2.o0(P);
            }
            bce.a(ze4Var, (xt4) P, rv4Var2, 6);
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            wzaVar2 = wzaVar;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new f58(d0bVar, wzaVar2, i, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(java.lang.StringBuilder r5, defpackage.e32 r6, defpackage.s11 r7, defpackage.n42 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.ix6
            if (r0 == 0) goto L13
            r0 = r8
            ix6 r0 = (defpackage.ix6) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ix6 r0 = new ix6
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            java.nio.charset.Charset r5 = r0.b
            java.lang.StringBuilder r6 = r0.a
            defpackage.hre.r(r8)     // Catch: java.lang.Throwable -> L2a
            goto L6f
        L2a:
            r5 = r6
            goto L77
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r3
        L32:
            defpackage.hre.r(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "BODY Content-Type: "
            r8.<init>(r1)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            r5.append(r8)
            r8 = 10
            r5.append(r8)
            java.lang.String r1 = "BODY START"
            r5.append(r1)
            r5.append(r8)
            if (r6 == 0) goto L5b
            java.nio.charset.Charset r6 = defpackage.h32.a(r6)
            if (r6 != 0) goto L5d
        L5b:
            java.nio.charset.Charset r6 = defpackage.ed1.a
        L5d:
            r0.a = r5     // Catch: java.lang.Throwable -> L77
            r0.b = r6     // Catch: java.lang.Throwable -> L77
            r0.d = r2     // Catch: java.lang.Throwable -> L77
            java.lang.Object r8 = defpackage.v9e.J(r7, r0)     // Catch: java.lang.Throwable -> L77
            n82 r7 = defpackage.n82.a
            if (r8 != r7) goto L6c
            return r7
        L6c:
            r4 = r6
            r6 = r5
            r5 = r4
        L6f:
            psa r8 = (defpackage.psa) r8     // Catch: java.lang.Throwable -> L2a
            r7 = 2
            java.lang.String r3 = defpackage.fre.o(r8, r5, r7)     // Catch: java.lang.Throwable -> L2a
            goto L78
        L77:
            r6 = r5
        L78:
            if (r3 != 0) goto L7c
            java.lang.String r3 = "[response body omitted]"
        L7c:
            r6.append(r3)
            java.lang.String r5 = "\nBODY END"
            r6.append(r5)
            pvc r5 = defpackage.pvc.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.owe.s(java.lang.StringBuilder, e32, s11, n42):java.lang.Object");
    }

    public static final String t(vl6 vl6Var) {
        String str = (String) sl1.d0(vl6Var.b.values());
        if (str == null) {
            str = "";
        }
        if (k4b.j0(str)) {
            String str2 = vl6Var.j;
            return k4b.E0('/', str2, str2);
        }
        return str;
    }

    public static final void u(ak3 ak3Var, float f2, float f3, long j) {
        yj a2 = dk.a();
        yj.a(a2, npe.m(f2, ak3Var.b1()));
        float f4 = 2.3f * f2;
        long i = y78.i(ak3Var.b1(), (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        float f5 = 1.8f * f2 * f3;
        yj a3 = dk.a();
        yj.a(a3, npe.m(f2, y78.j(i, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L))));
        yj a4 = dk.a();
        a4.j(a2, a3, 0);
        ak3.t1(ak3Var, a4, j, nae.e, null, 60);
    }

    public static final void v(k61 k61Var, kwe kweVar, ljc ljcVar) {
        if (kweVar instanceof tf8) {
            rk9 rk9Var = ((tf8) kweVar).c;
            k61Var.getClass();
            k61Var.g(rk9Var.a, rk9Var.b, rk9Var.c, rk9Var.d, ljcVar);
        } else if (kweVar instanceof uf8) {
            uf8 uf8Var = (uf8) kweVar;
            ou9 ou9Var = uf8Var.c;
            long j = ou9Var.h;
            yj yjVar = uf8Var.d;
            if (yjVar != null) {
                k61Var.b(yjVar, ljcVar);
            } else {
                k61Var.e(ou9Var.a, ou9Var.b, ou9Var.c, ou9Var.d, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), ljcVar);
            }
        } else if (kweVar instanceof sf8) {
            k61Var.b(((sf8) kweVar).c, ljcVar);
        } else {
            xk5.o();
        }
    }

    public static void w(qd6 qd6Var, kwe kweVar, hy0 hy0Var, float f2, int i) {
        float f3;
        if ((i & 4) != 0) {
            f3 = 1.0f;
        } else {
            f3 = f2;
        }
        boolean z = kweVar instanceof tf8;
        ye4 ye4Var = ye4.a;
        if (z) {
            rk9 rk9Var = ((tf8) kweVar).c;
            float f4 = rk9Var.a;
            float f5 = rk9Var.b;
            qd6Var.r1(hy0Var, (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32), N(rk9Var), f3, ye4Var, null, 3);
        } else if (kweVar instanceof uf8) {
            uf8 uf8Var = (uf8) kweVar;
            yj yjVar = uf8Var.d;
            if (yjVar != null) {
                qd6Var.U(yjVar, hy0Var, f3, ye4Var, null, 3);
                return;
            }
            ou9 ou9Var = uf8Var.c;
            float intBitsToFloat = Float.intBitsToFloat((int) (ou9Var.h >> 32));
            float f6 = ou9Var.a;
            float f7 = ou9Var.b;
            qd6Var.e1(hy0Var, (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32), (Float.floatToRawIntBits(ou9Var.b()) << 32) | (Float.floatToRawIntBits(ou9Var.a()) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), f3, ye4Var, null, 3);
        } else if (kweVar instanceof sf8) {
            qd6Var.U(((sf8) kweVar).c, hy0Var, f3, ye4Var, null, 3);
        } else {
            xk5.o();
        }
    }

    public static void x(qd6 qd6Var, kwe kweVar, long j) {
        boolean z = kweVar instanceof tf8;
        ye4 ye4Var = ye4.a;
        if (z) {
            rk9 rk9Var = ((tf8) kweVar).c;
            float f2 = rk9Var.a;
            float f3 = rk9Var.b;
            qd6Var.X(j, (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), N(rk9Var), 1.0f, ye4Var, 3);
        } else if (kweVar instanceof uf8) {
            uf8 uf8Var = (uf8) kweVar;
            yj yjVar = uf8Var.d;
            if (yjVar != null) {
                qd6Var.D(yjVar, j, 1.0f, ye4Var);
                return;
            }
            ou9 ou9Var = uf8Var.c;
            float intBitsToFloat = Float.intBitsToFloat((int) (ou9Var.h >> 32));
            float f4 = ou9Var.a;
            float f5 = ou9Var.b;
            qd6Var.K0(j, (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32), (Float.floatToRawIntBits(ou9Var.b()) << 32) | (Float.floatToRawIntBits(ou9Var.a()) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), ye4Var, 1.0f);
        } else if (kweVar instanceof sf8) {
            qd6Var.D(((sf8) kweVar).c, j, 1.0f, ye4Var);
        } else {
            xk5.o();
        }
    }

    public static void y(ak3 ak3Var, long j, float f2, float f3, float f4, float f5) {
        for (int i = 0; i < 8; i++) {
            double d2 = (float) ((i * 6.283185307179586d) / 8.0d);
            float f6 = f2 + f4;
            ak3.Y0(ak3Var, j, (Float.floatToRawIntBits((((float) Math.cos(d2)) * f2) + Float.intBitsToFloat((int) (ak3Var.b1() >> 32))) << 32) | (Float.floatToRawIntBits((((float) Math.sin(d2)) * f2) + Float.intBitsToFloat((int) (ak3Var.b1() & 4294967295L))) & 4294967295L), (Float.floatToRawIntBits((((float) Math.cos(d2)) * f6) + Float.intBitsToFloat((int) (ak3Var.b1() >> 32))) << 32) | (Float.floatToRawIntBits((f6 * ((float) Math.sin(d2))) + Float.intBitsToFloat((int) (ak3Var.b1() & 4294967295L))) & 4294967295L), f3, 1, f5, 416);
        }
    }

    public static final void z(ak3 ak3Var, long j, long j2, float f2, float f3) {
        float f4 = 0.1f * f2;
        yj a2 = dk.a();
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        a2.i(Float.intBitsToFloat(i) - f2, Float.intBitsToFloat(i2));
        a2.k(Float.intBitsToFloat(i) - f4, Float.intBitsToFloat(i2) - f4, Float.intBitsToFloat(i), Float.intBitsToFloat(i2) - f2);
        a2.k(Float.intBitsToFloat(i) + f4, Float.intBitsToFloat(i2) - f4, Float.intBitsToFloat(i) + f2, Float.intBitsToFloat(i2));
        a2.k(Float.intBitsToFloat(i) + f4, Float.intBitsToFloat(i2) + f4, Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + f2);
        a2.k(Float.intBitsToFloat(i) - f4, Float.intBitsToFloat(i2) + f4, Float.intBitsToFloat(i) - f2, Float.intBitsToFloat(i2));
        ak3.t1(ak3Var, a2, j, f3, null, 56);
    }
}
