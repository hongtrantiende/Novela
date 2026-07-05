package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qh6  reason: default package */
/* loaded from: classes.dex */
public final class qh6 {
    public final tv7 a;
    public kj b;
    public int c;
    public final uv7 d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public fb3 j;

    public qh6() {
        long[] jArr = tz9.a;
        this.a = new tv7();
        uv7 uv7Var = uz9.a;
        this.d = new uv7();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    public static void c(wh6 wh6Var, int i, oh6 oh6Var, boolean z) {
        long a;
        int i2 = 0;
        long g = wh6Var.g(0);
        if (z) {
            a = py5.a(0, i, 1, g);
        } else {
            a = py5.a(i, 0, 2, g);
        }
        mh6[] mh6VarArr = oh6Var.a;
        int length = mh6VarArr.length;
        int i3 = 0;
        while (i2 < length) {
            mh6 mh6Var = mh6VarArr[i2];
            int i4 = i3 + 1;
            if (mh6Var != null) {
                mh6Var.l = py5.d(a, py5.c(wh6Var.g(i3), g));
            }
            i2++;
            i3 = i4;
        }
    }

    public static int h(int[] iArr, wh6 wh6Var, boolean z) {
        int h = wh6Var.h();
        int b = wh6Var.b() + h;
        int i = 0;
        while (h < b) {
            int t = hif.t(wh6Var, z) + iArr[h];
            iArr[h] = t;
            i = Math.max(i, t);
            h++;
        }
        return i;
    }

    public final mh6 a(int i, Object obj) {
        oh6 oh6Var = (oh6) this.a.g(obj);
        if (oh6Var != null) {
            return oh6Var.a[i];
        }
        return null;
    }

    public final long b() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            mh6 mh6Var = (mh6) arrayList.get(i);
            p15 p15Var = mh6Var.o;
            if (p15Var != null) {
                int max = Math.max((int) (j >> 32), ((int) (mh6Var.l >> 32)) + ((int) (p15Var.u >> 32)));
                j = (Math.max((int) (j & 4294967295L), ((int) (mh6Var.l & 4294967295L)) + ((int) (p15Var.u & 4294967295L))) & 4294967295L) | (max << 32);
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e0, code lost:
        r9 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e3, code lost:
        r17 = r10;
        r5 = r9;
        r9 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ea, code lost:
        r51 = r9;
        r9 = r5;
        r4 = r51;
        r10 = r17 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f4, code lost:
        r9 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f5, code lost:
        if (r18 == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f7, code lost:
        r3 = r2.a;
        r4 = r3.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01fb, code lost:
        if (r5 >= r4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01fd, code lost:
        r6 = r3[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ff, code lost:
        if (r6 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0205, code lost:
        if (r6.c() == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0207, code lost:
        r15.remove(r6);
        r7 = r53.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x020c, code lost:
        if (r7 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x020e, code lost:
        defpackage.hud.o(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0211, code lost:
        r6.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0214, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0217, code lost:
        g(r11, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x021d, code lost:
        r51 = r15;
        r7 = r7 + 1;
        r9 = r9;
        r6 = r6;
        r15 = r51;
        r16 = r16;
        r8 = r8;
        r10 = r10;
        r2 = r19;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x023f, code lost:
        r19 = r2;
        r21 = r3;
        r2 = r8;
        r9 = r16;
        r16 = r15;
        f(r11.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0252, code lost:
        r3 = r21 + 1;
        r4 = r57;
        r8 = r2;
        r15 = r16;
        r2 = r19;
        r16 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0261, code lost:
        r15 = r6;
        r2 = r8;
        r6 = r9;
        r3 = r10;
        r4 = 2;
        r5 = new int[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x026b, code lost:
        if (r25 == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x026d, code lost:
        if (r14 == null) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0273, code lost:
        if (r3.isEmpty() != false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x027a, code lost:
        if (r3.size() <= 1) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x027c, code lost:
        defpackage.wl1.O(new defpackage.ph6(r14, 2), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0284, code lost:
        r9 = r3.size();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0289, code lost:
        if (r10 >= r9) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x028b, code lost:
        r11 = (defpackage.wh6) r3.get(r10);
        r63 = r4;
        r4 = r2.g(r11.getKey());
        r4.getClass();
        c(r11, r64 - h(r5, r11, r60), (defpackage.oh6) r4, r60);
        g(r11, false);
        r10 = r10 + 1;
        r4 = r63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02b2, code lost:
        r4 = 0;
        defpackage.b00.h0(0, 0, 6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b9, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02c0, code lost:
        if (r6.isEmpty() != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02c7, code lost:
        if (r6.size() <= 1) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02c9, code lost:
        defpackage.wl1.O(new defpackage.ph6(r14, r4), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02d1, code lost:
        r4 = r6.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02d6, code lost:
        if (r9 >= r4) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02d8, code lost:
        r10 = (defpackage.wh6) r6.get(r9);
        r11 = (h(r5, r10, r60) + r65) - defpackage.hif.t(r10, r60);
        r12 = r2.g(r10.getKey());
        r12.getClass();
        c(r10, r11, (defpackage.oh6) r12, r60);
        g(r10, false);
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0300, code lost:
        defpackage.b00.h0(0, 0, 6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0307, code lost:
        r4 = r1.b;
        r9 = r1.a;
        r10 = r9.length - 2;
        r12 = r53.h;
        r11 = r53.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0312, code lost:
        if (r10 < 0) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0314, code lost:
        r35 = r1;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0317, code lost:
        r7 = r9[r1];
        r37 = r3;
        r38 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0325, code lost:
        if (((((~r7) << 7) & r7) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0327, code lost:
        r3 = 8 - ((~(r1 - r10)) >>> 31);
        r39 = r7;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0333, code lost:
        if (r4 >= r3) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0339, code lost:
        if ((r39 & 255) >= 128) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x033b, code lost:
        r7 = r38[(r1 << 3) + r4];
        r8 = (defpackage.oh6) r2.g(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0346, code lost:
        if (r8 != null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x034a, code lost:
        r41 = r4;
        r48 = r6;
        r6 = r58.o(r7);
        r49 = r9;
        r9 = java.lang.Math.min(r13, r8.e);
        r8.e = r9;
        r50 = r10;
        r8.d = java.lang.Math.min(r13 - r9, r8.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x036b, code lost:
        if (r6 != (-1)) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x036d, code lost:
        r6 = r8.a;
        r10 = r6.length;
        r9 = 0;
        r42 = false;
        r43 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0375, code lost:
        if (r9 >= r10) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0377, code lost:
        r44 = r6;
        r6 = r44[r9];
        r45 = r43 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x037d, code lost:
        if (r6 == null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0383, code lost:
        if (r6.c() == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0385, code lost:
        r46 = r9;
        r16 = r10;
        r17 = r11;
        r13 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0390, code lost:
        r46 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x039e, code lost:
        if (((java.lang.Boolean) r6.k.getValue()).booleanValue() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03a0, code lost:
        r6.d();
        r8.a[r43] = r20;
        r15.remove(r6);
        r6 = r53.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x03ac, code lost:
        if (r6 == null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03ae, code lost:
        defpackage.hud.o(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03b2, code lost:
        r9 = r6.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x03b4, code lost:
        if (r9 == null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03b6, code lost:
        r9 = r6.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03be, code lost:
        if (r6.c() != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03c0, code lost:
        if (r9 != null) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03c3, code lost:
        r6.f(true);
        r9 = r6.a;
        r16 = new defpackage.qq4(r6, r9, r9, r20, 16);
        r16 = r10;
        r6 = r6;
        r13 = r20;
        r17 = r11;
        defpackage.z87.v(r9, r13, r13, r16, 3);
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03e4, code lost:
        r16 = r10;
        r17 = r11;
        r13 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03ef, code lost:
        if (r6.c() == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03f1, code lost:
        r15.add(r6);
        r6 = r53.j;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03f6, code lost:
        if (r6 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03f8, code lost:
        defpackage.hud.o(r6);
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03fb, code lost:
        r42 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03fe, code lost:
        r6.d();
        r8.a[r43] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0406, code lost:
        r46 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0408, code lost:
        r16 = r10;
        r17 = r11;
        r13 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x040f, code lost:
        r9 = r46 + 1;
        r20 = r13;
        r10 = r16;
        r11 = r17;
        r6 = r44;
        r43 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x041f, code lost:
        r17 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0424, code lost:
        if (r42 != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0426, code lost:
        f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0429, code lost:
        r18 = r14;
        r16 = r15;
        r14 = r17;
        r15 = r50;
        r17 = r5;
        r5 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0438, code lost:
        r17 = r11;
        r9 = r8.b;
        r9.getClass();
        r6 = r59.x(r6, r8.d, r8.e, r9.a);
        r6.j();
        r9 = r8.a;
        r10 = r9.length;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x045f, code lost:
        if (r11 >= r10) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0461, code lost:
        r16 = r6;
        r6 = r9[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0465, code lost:
        if (r6 == null) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0467, code lost:
        r18 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0476, code lost:
        if (((java.lang.Boolean) r6.h.getValue()).booleanValue() != true) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x047a, code lost:
        r18 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x047c, code lost:
        r11 = r11 + 1;
        r6 = r16;
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        r15 = r53.c;
        r6 = (defpackage.wh6) defpackage.sl1.e0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0483, code lost:
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0485, code lost:
        if (r14 == null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x048b, code lost:
        if (r6 != r14.o(r7)) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x048d, code lost:
        f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0491, code lost:
        r18 = r14;
        r7 = r16;
        r14 = r17;
        r17 = r5;
        r5 = r12;
        r16 = r15;
        r15 = r50;
        r8.a(r7, r66, r67, r64, r65, r8.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x04b0, code lost:
        if (r6 >= r53.c) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x04b2, code lost:
        r14.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x04b6, code lost:
        r5.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r6 == null) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x04bc, code lost:
        r41 = r4;
        r17 = r5;
        r48 = r6;
        r49 = r9;
        r5 = r12;
        r18 = r14;
        r16 = r15;
        r15 = r10;
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x04d0, code lost:
        r39 = r39 >> 8;
        r13 = r62;
        r12 = r5;
        r4 = r41 + 1;
        r11 = r14;
        r10 = r15;
        r15 = r16;
        r5 = r17;
        r14 = r18;
        r6 = r48;
        r9 = r49;
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x04e8, code lost:
        r4 = r58;
        r17 = r5;
        r48 = r6;
        r49 = r9;
        r5 = r12;
        r18 = r14;
        r16 = r15;
        r15 = r10;
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x04fb, code lost:
        if (r3 != 8) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x04fe, code lost:
        r4 = r58;
        r17 = r5;
        r48 = r6;
        r49 = r9;
        r5 = r12;
        r18 = r14;
        r16 = r15;
        r15 = r10;
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0511, code lost:
        if (r1 == r15) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0513, code lost:
        r1 = r1 + 1;
        r13 = r62;
        r12 = r5;
        r11 = r14;
        r10 = r15;
        r15 = r16;
        r5 = r17;
        r14 = r18;
        r3 = r37;
        r4 = r38;
        r6 = r48;
        r9 = r49;
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x052c, code lost:
        r4 = r58;
        r35 = r1;
        r37 = r3;
        r17 = r5;
        r48 = r6;
        r14 = r11;
        r5 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        r6 = r6.getIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x053c, code lost:
        if (r14.isEmpty() != false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0543, code lost:
        if (r14.size() <= 1) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0545, code lost:
        defpackage.wl1.O(new defpackage.ph6(r4, 3), r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x054e, code lost:
        r1 = r14.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0553, code lost:
        if (r3 >= r1) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0555, code lost:
        r6 = (defpackage.wh6) r14.get(r3);
        r7 = r2.g(r6.getKey());
        r7.getClass();
        r7 = (defpackage.oh6) r7;
        r8 = r17;
        r9 = h(r8, r6, r60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0570, code lost:
        if (r61 == false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0572, code lost:
        r15 = ((defpackage.wh6) defpackage.sl1.c0(r57)).g(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x057d, code lost:
        if (r60 == false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x057f, code lost:
        r10 = r15 & 4294967295L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0581, code lost:
        r10 = (int) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0583, code lost:
        r10 = r15 >> 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0586, code lost:
        r10 = r7.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0588, code lost:
        r6.k(r10 - r9, r7.c, r55, r56);
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0592, code lost:
        if (r25 == false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0594, code lost:
        g(r6, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0598, code lost:
        r3 = r3 + 1;
        r17 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x059d, code lost:
        r9 = r55;
        r11 = r56;
        r12 = r60;
        r8 = r17;
        defpackage.b00.h0(0, 0, 6, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x05ab, code lost:
        r9 = r55;
        r11 = r56;
        r12 = r60;
        r8 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
        r53.c = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x05b7, code lost:
        if (r5.isEmpty() != false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x05be, code lost:
        if (r5.size() <= 1) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x05c0, code lost:
        defpackage.wl1.O(new defpackage.ph6(r4, 1), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x05c8, code lost:
        r1 = r5.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x05cd, code lost:
        if (r3 >= r1) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x05cf, code lost:
        r4 = (defpackage.wh6) r5.get(r3);
        r6 = r2.g(r4.getKey());
        r6.getClass();
        r6 = (defpackage.oh6) r6;
        r4.k((r6.g - defpackage.hif.t(r4, r12)) + h(r8, r4, r12), r6.c, r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x05f4, code lost:
        if (r25 == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x05f6, code lost:
        g(r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
        if (r60 == false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x05f9, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x05fc, code lost:
        java.util.Collections.reverse(r14);
        r57.addAll(0, r14);
        r57.addAll(r5);
        r37.clear();
        r48.clear();
        r14.clear();
        r5.clear();
        r35.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0617, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
        r6 = r54 & 4294967295L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
        r6 = r54 << 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r61 != false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
        if (r63 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
        r25 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
        r25 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
        r9 = r8.b;
        r10 = r8.a;
        r11 = r10.length - 2;
        r1 = r53.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
        if (r11 < 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
        r2 = r10[r12];
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
        if (((((~r2) << 7) & r2) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
        r6 = 8 - ((~(r12 - r11)) >>> 31);
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00af, code lost:
        if (r7 >= r6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b5, code lost:
        if ((r2 & 255) >= 128) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
        r34 = r2;
        r1.a(r9[(r12 << 3) + r7]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c3, code lost:
        r34 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c5, code lost:
        r2 = r34 >> 8;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cc, code lost:
        if (r6 != 8) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
        if (r12 == r11) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
        r12 = r12 + 1;
        r6 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d5, code lost:
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d7, code lost:
        r2 = r4.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dc, code lost:
        r6 = r53.i;
        r9 = r53.f;
        r10 = r53.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e2, code lost:
        if (r3 >= r2) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e4, code lost:
        r11 = (defpackage.wh6) r4.get(r3);
        r1.l(r11.getKey());
        r12 = r11.e().size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fa, code lost:
        if (r7 >= r12) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fc, code lost:
        r19 = r2;
        r2 = ((defpackage.mw8) r11.e().get(r7)).S();
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0110, code lost:
        if ((r2 instanceof defpackage.zg6) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0112, code lost:
        r2 = (defpackage.zg6) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0117, code lost:
        if (r2 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0119, code lost:
        r2 = (defpackage.oh6) r8.g(r11.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0123, code lost:
        if (r14 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0125, code lost:
        r3 = r14.o(r11.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012f, code lost:
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0131, code lost:
        if (r3 != (-1)) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0133, code lost:
        if (r14 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0135, code lost:
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0138, code lost:
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013a, code lost:
        if (r2 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013c, code lost:
        r6 = new defpackage.oh6(r53);
        r12 = r60;
        r2 = r8;
        r36 = r9;
        r37 = r10;
        r4 = r16;
        defpackage.oh6.b(r6, r11, r66, r67, r64, r65, r12);
        r2.n(r11.getKey(), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0161, code lost:
        if (r11.getIndex() == r3) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0164, code lost:
        if (r3 == (-1)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0166, code lost:
        if (r3 >= r15) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0168, code lost:
        r37.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016e, code lost:
        r36.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0173, code lost:
        r9 = r4;
        r16 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017a, code lost:
        r8 = r11.g(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017f, code lost:
        if (r12 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0181, code lost:
        r8 = r8 & 4294967295L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0185, code lost:
        r8 = r8 >> 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0188, code lost:
        c(r11, (int) r8, r6, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018b, code lost:
        if (r18 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018d, code lost:
        r3 = r6.a;
        r6 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0191, code lost:
        if (r7 >= r6) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0193, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0195, code lost:
        if (r8 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0197, code lost:
        r8.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019a, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019d, code lost:
        r12 = r60;
        r2 = r8;
        r4 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a5, code lost:
        if (r25 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a7, code lost:
        r16 = r15;
        r15 = r6;
        defpackage.oh6.b(r2, r11, r66, r67, r64, r65, r12);
        r7 = r2.a;
        r9 = r7.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bd, code lost:
        if (r10 >= r9) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01bf, code lost:
        r12 = r7[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c1, code lost:
        if (r12 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c3, code lost:
        r35 = r4;
        r5 = r9;
        r17 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d3, code lost:
        if (defpackage.py5.b(r12.l, 9223372034707292159L) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d5, code lost:
        r9 = r35;
        r12.l = defpackage.py5.d(r12.l, r9);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v15, types: [p82, d82] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r54, int r55, int r56, java.util.ArrayList r57, defpackage.kj r58, defpackage.c3e r59, boolean r60, boolean r61, int r62, boolean r63, int r64, int r65, defpackage.m82 r66, defpackage.m15 r67) {
        /*
            Method dump skipped, instructions count: 1560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qh6.d(int, int, int, java.util.ArrayList, kj, c3e, boolean, boolean, int, boolean, int, int, m82, m15):void");
    }

    public final void e() {
        mh6[] mh6VarArr;
        tv7 tv7Var = this.a;
        if (tv7Var.j()) {
            Object[] objArr = tv7Var.c;
            long[] jArr = tv7Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (mh6 mh6Var : ((oh6) objArr[(i << 3) + i3]).a) {
                                    if (mh6Var != null) {
                                        mh6Var.d();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            tv7Var.a();
        }
    }

    public final void f(Object obj) {
        mh6[] mh6VarArr;
        oh6 oh6Var = (oh6) this.a.l(obj);
        if (oh6Var != null) {
            for (mh6 mh6Var : oh6Var.a) {
                if (mh6Var != null) {
                    mh6Var.d();
                }
            }
        }
    }

    public final void g(wh6 wh6Var, boolean z) {
        Object g = this.a.g(wh6Var.getKey());
        g.getClass();
        mh6[] mh6VarArr = ((oh6) g).a;
        int length = mh6VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            mh6 mh6Var = mh6VarArr[i];
            int i3 = i2 + 1;
            if (mh6Var != null) {
                long g2 = wh6Var.g(i2);
                long j = mh6Var.l;
                if (!py5.b(j, 9223372034707292159L) && !py5.b(j, g2)) {
                    long c = py5.c(g2, j);
                    lf4 lf4Var = mh6Var.e;
                    if (lf4Var != null) {
                        long c2 = py5.c(((py5) mh6Var.r.getValue()).a, c);
                        mh6Var.h(c2);
                        mh6Var.g(true);
                        mh6Var.g = z;
                        z87.v(mh6Var.a, null, null, new o0(mh6Var, lf4Var, c2, (m42) null), 3);
                    }
                }
                mh6Var.l = g2;
            }
            i++;
            i2 = i3;
        }
    }
}
