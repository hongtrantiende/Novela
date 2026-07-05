package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: co  reason: default package */
/* loaded from: classes.dex */
public final class co {
    public final Context a;
    public rwa b;
    public TextToSpeech c;
    public boolean f;
    public int g;
    public boolean h;
    public long j;
    public final m41 k;
    public final HashSet l;
    public ny7 m;
    public int n;
    public final vn o;
    public final boolean p;
    public final boolean q;
    public final float r;
    public final float s;
    public final cza d = dza.a(null);
    public final Bundle e = new Bundle();
    public List i = ks3.a;

    public co(Context context) {
        this.a = context;
        hq7 hq7Var = wl3.b;
        this.j = 0L;
        sw2 sw2Var = ab3.a;
        this.k = k27.a(zz6.a.f);
        this.l = new HashSet();
        this.o = new vn(this);
        this.p = true;
        this.q = true;
        this.r = Float.MAX_VALUE;
        this.s = Float.MAX_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.co r10, int r11, defpackage.n42 r12) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.co.a(co, int, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.rn
            if (r0 == 0) goto L13
            r0 = r5
            rn r0 = (defpackage.rn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            rn r0 = new rn
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r5)
            goto L45
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r5)
            r4.f()
            mx r5 = new mx
            r1 = 4
            cza r4 = r4.d
            r5.<init>(r4, r1)
            r0.c = r2
            java.lang.Object r5 = defpackage.z1d.C(r5, r0)
            n82 r4 = defpackage.n82.a
            if (r5 != r4) goto L45
            return r4
        L45:
            java.lang.Number r5 = (java.lang.Number) r5
            int r4 = r5.intValue()
            if (r4 != 0) goto L50
            pvc r4 = defpackage.pvc.a
            return r4
        L50:
            e60 r4 = new e60
            r5 = 17
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.co.b(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.n42 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.sn
            if (r0 == 0) goto L13
            r0 = r6
            sn r0 = (defpackage.sn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            sn r0 = new sn
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.hre.r(r6)
            goto L3a
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r2
        L2c:
            defpackage.hre.r(r6)
            r0.c = r3
            java.lang.Object r6 = r5.b(r0)
            n82 r0 = defpackage.n82.a
            if (r6 != r0) goto L3a
            return r0
        L3a:
            android.speech.tts.TextToSpeech r5 = r5.c
            r5.getClass()
            java.util.Set r5 = r5.getAvailableLanguages()
            if (r5 == 0) goto Laa
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.tl1.s(r5, r0)
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L56:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L9f
            java.lang.Object r0 = r5.next()
            java.util.Locale r0 = (java.util.Locale) r0
            java.lang.String r1 = r0.getDisplayLanguage()
            java.lang.String r2 = r0.getDisplayLanguage(r0)
            java.lang.String r3 = r0.getDisplayCountry(r0)
            java.lang.String r0 = r0.toLanguageTag()
            r0.getClass()
            int r4 = r3.length()
            if (r4 != 0) goto L7c
            goto L7d
        L7c:
            r2 = r3
        L7d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " ("
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = ")"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            oy7 r2 = new oy7
            r2.<init>(r0, r1)
            r6.add(r2)
            goto L56
        L9f:
            kn4 r5 = new kn4
            r0 = 9
            r5.<init>(r0)
            java.util.List r2 = defpackage.sl1.u0(r6, r5)
        Laa:
            if (r2 != 0) goto Laf
            ks3 r5 = defpackage.ks3.a
            return r5
        Laf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.co.c(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[LOOP:0: B:18:0x0055->B:20:0x005b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.tn
            if (r0 == 0) goto L13
            r0 = r5
            tn r0 = (defpackage.tn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tn r0 = new tn
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r5)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r5)
            r0.c = r2
            java.lang.Object r5 = r4.b(r0)
            n82 r0 = defpackage.n82.a
            if (r5 != r0) goto L3a
            return r0
        L3a:
            android.speech.tts.TextToSpeech r4 = r4.c
            r4.getClass()
            java.util.List r4 = r4.getEngines()
            r4.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.tl1.s(r4, r0)
            r5.<init>(r0)
            java.util.Iterator r4 = r4.iterator()
        L55:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r0 = r4.next()
            android.speech.tts.TextToSpeech$EngineInfo r0 = (android.speech.tts.TextToSpeech.EngineInfo) r0
            ny7 r1 = new ny7
            java.lang.String r2 = r0.name
            r2.getClass()
            java.lang.String r0 = r0.label
            r0.getClass()
            r1.<init>(r2, r0)
            r5.add(r1)
            goto L55
        L74:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.co.d(n42):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086 A[LOOP:1: B:28:0x0084->B:29:0x0086, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(defpackage.oy7 r6, defpackage.n42 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.un
            if (r0 == 0) goto L13
            r0 = r7
            un r0 = (defpackage.un) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            un r0 = new un
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            oy7 r6 = r0.a
            defpackage.hre.r(r7)
            goto L3e
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r2
        L2e:
            defpackage.hre.r(r7)
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = r5.b(r0)
            n82 r0 = defpackage.n82.a
            if (r7 != r0) goto L3e
            return r0
        L3e:
            android.speech.tts.TextToSpeech r5 = r5.c
            if (r5 == 0) goto La4
            java.util.Set r5 = r5.getVoices()
            if (r5 == 0) goto La4
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L53:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r0 = r5.next()
            r1 = r0
            android.speech.tts.Voice r1 = (android.speech.tts.Voice) r1
            java.util.Locale r1 = r1.getLocale()
            java.lang.String r1 = r1.toLanguageTag()
            java.lang.String r2 = r6.a
            boolean r1 = defpackage.c16.i(r1, r2)
            if (r1 == 0) goto L53
            r7.add(r0)
            goto L53
        L74:
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.tl1.s(r7, r5)
            r2.<init>(r5)
            int r5 = r7.size()
            r6 = 0
        L84:
            if (r6 >= r5) goto La4
            java.lang.Object r0 = r7.get(r6)
            int r6 = r6 + 1
            android.speech.tts.Voice r0 = (android.speech.tts.Voice) r0
            py7 r1 = new py7
            java.lang.String r3 = r0.getName()
            r3.getClass()
            java.lang.String r4 = ""
            boolean r0 = r0.isNetworkConnectionRequired()
            r1.<init>(r3, r4, r0)
            r2.add(r1)
            goto L84
        La4:
            if (r2 != 0) goto La9
            ks3 r5 = defpackage.ks3.a
            return r5
        La9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.co.e(oy7, n42):java.io.Serializable");
    }

    public final void f() {
        String str;
        if (!this.f) {
            TextToSpeech textToSpeech = this.c;
            if (textToSpeech != null) {
                Field[] declaredFields = textToSpeech.getClass().getDeclaredFields();
                declaredFields.getClass();
                boolean z = true;
                for (Field field : declaredFields) {
                    field.setAccessible(true);
                    if ("mServiceConnection".equals(field.getName()) && "android.speech.tts.TextToSpeech$Connection".equals(field.getType().getName())) {
                        try {
                            if (field.get(textToSpeech) == null) {
                                z = false;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                if (z) {
                    return;
                }
            }
            TextToSpeech.OnInitListener onInitListener = new TextToSpeech.OnInitListener() { // from class: qn
                @Override // android.speech.tts.TextToSpeech.OnInitListener
                public final void onInit(int i) {
                    co coVar = co.this;
                    TextToSpeech textToSpeech2 = coVar.c;
                    if (textToSpeech2 != null) {
                        textToSpeech2.setOnUtteranceProgressListener(coVar.o);
                    }
                    cza czaVar = coVar.d;
                    Integer valueOf = Integer.valueOf(i);
                    czaVar.getClass();
                    czaVar.n(null, valueOf);
                }
            };
            ny7 ny7Var = this.m;
            if (ny7Var != null) {
                str = ny7Var.a;
            } else {
                str = null;
            }
            this.c = new TextToSpeech(this.a, onInitListener, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a A[EDGE_INSN: B:31:0x006a->B:23:0x006a ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.oy7 r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.wn
            if (r0 == 0) goto L13
            r0 = r6
            wn r0 = (defpackage.wn) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            wn r0 = new wn
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            oy7 r5 = r0.a
            defpackage.hre.r(r6)
            goto L3e
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r2
        L2e:
            defpackage.hre.r(r6)
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r4.b(r0)
            n82 r0 = defpackage.n82.a
            if (r6 != r0) goto L3e
            return r0
        L3e:
            android.speech.tts.TextToSpeech r6 = r4.c
            r6.getClass()
            java.util.Set r6 = r6.getAvailableLanguages()
            r6.getClass()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L50:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r6.next()
            r1 = r0
            java.util.Locale r1 = (java.util.Locale) r1
            java.lang.String r1 = r1.toLanguageTag()
            java.lang.String r3 = r5.a
            boolean r1 = defpackage.c16.i(r1, r3)
            if (r1 == 0) goto L50
            r2 = r0
        L6a:
            java.util.Locale r2 = (java.util.Locale) r2
            if (r2 != 0) goto L7b
            android.speech.tts.TextToSpeech r5 = r4.c
            r5.getClass()
            android.speech.tts.Voice r5 = r5.getVoice()
            java.util.Locale r2 = r5.getLocale()
        L7b:
            android.speech.tts.TextToSpeech r4 = r4.c
            if (r4 == 0) goto L82
            r4.setLanguage(r2)
        L82:
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.co.g(oy7, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(float r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.xn
            if (r0 == 0) goto L13
            r0 = r6
            xn r0 = (defpackage.xn) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            xn r0 = new xn
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            float r5 = r0.a
            defpackage.hre.r(r6)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r6)
            r0.a = r5
            r0.d = r2
            java.lang.Object r6 = r4.b(r0)
            n82 r0 = defpackage.n82.a
            if (r6 != r0) goto L3e
            return r0
        L3e:
            android.speech.tts.TextToSpeech r4 = r4.c
            if (r4 == 0) goto L49
            int r4 = r4.setPitch(r5)
            defpackage.nc2.c(r4)
        L49:
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.co.h(float, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(float r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.yn
            if (r0 == 0) goto L13
            r0 = r6
            yn r0 = (defpackage.yn) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            yn r0 = new yn
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            float r5 = r0.a
            defpackage.hre.r(r6)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r6)
            r0.a = r5
            r0.d = r2
            java.lang.Object r6 = r4.b(r0)
            n82 r0 = defpackage.n82.a
            if (r6 != r0) goto L3e
            return r0
        L3e:
            android.speech.tts.TextToSpeech r4 = r4.c
            if (r4 == 0) goto L49
            int r4 = r4.setSpeechRate(r5)
            defpackage.nc2.c(r4)
        L49:
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.co.i(float, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.py7 r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.zn
            if (r0 == 0) goto L13
            r0 = r6
            zn r0 = (defpackage.zn) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            zn r0 = new zn
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            py7 r5 = r0.a
            defpackage.hre.r(r6)
            goto L3e
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r2
        L2e:
            defpackage.hre.r(r6)
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r4.b(r0)
            n82 r0 = defpackage.n82.a
            if (r6 != r0) goto L3e
            return r0
        L3e:
            android.speech.tts.TextToSpeech r6 = r4.c
            r6.getClass()
            java.util.Set r6 = r6.getVoices()
            if (r6 == 0) goto L6d
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L4f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r6.next()
            r1 = r0
            android.speech.tts.Voice r1 = (android.speech.tts.Voice) r1
            java.lang.String r1 = r1.getName()
            java.lang.String r3 = r5.a
            boolean r1 = defpackage.c16.i(r1, r3)
            if (r1 == 0) goto L4f
            r2 = r0
        L69:
            android.speech.tts.Voice r2 = (android.speech.tts.Voice) r2
            if (r2 != 0) goto L76
        L6d:
            android.speech.tts.TextToSpeech r5 = r4.c
            r5.getClass()
            android.speech.tts.Voice r2 = r5.getVoice()
        L76:
            android.speech.tts.TextToSpeech r4 = r4.c
            if (r4 == 0) goto L7d
            r4.setVoice(r2)
        L7d:
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.co.j(py7, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.util.ArrayList r5, int r6, long r7, defpackage.n42 r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.ao
            if (r0 == 0) goto L13
            r0 = r9
            ao r0 = (defpackage.ao) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ao r0 = new ao
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.d
            int r1 = r0.f
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            long r7 = r0.c
            int r6 = r0.b
            java.util.ArrayList r5 = r0.a
            defpackage.hre.r(r9)
            goto L46
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L32:
            defpackage.hre.r(r9)
            r0.a = r5
            r0.b = r6
            r0.c = r7
            r0.f = r2
            java.lang.Object r9 = r4.b(r0)
            n82 r0 = defpackage.n82.a
            if (r9 != r0) goto L46
            return r0
        L46:
            r4.j = r7
            r4.g = r6
            r4.i = r5
            r4.l()
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.co.k(java.util.ArrayList, int, long, n42):java.lang.Object");
    }

    public final void l() {
        if (this.g < this.i.size()) {
            this.h = true;
            z87.v(this.k, null, null, new oi(this, (m42) null, 1), 3);
            return;
        }
        this.h = false;
        rwa rwaVar = this.b;
        if (rwaVar != null) {
            ((bp9) rwaVar.c).n();
        }
    }
}
