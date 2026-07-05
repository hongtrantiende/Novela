package defpackage;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a1c  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1c implements vt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ a1c(int i) {
        this.a = i;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("No TextToSpeechColorSchemeState provided");
            case 1:
                return v9e.o("tts_settings");
            case 2:
                return yae.z(Boolean.FALSE);
            case 3:
                return yae.z(new jub("", 0L, 6));
            case 4:
                return yae.z(Boolean.FALSE);
            case 5:
                return yae.z(Boolean.FALSE);
            case 6:
                return new k97(20);
            case 7:
                o9a[] o9aVarArr = new o9a[0];
                if (!k4b.j0("kotlinx.datetime.TimeBased")) {
                    hi1 hi1Var = new hi1("kotlinx.datetime.TimeBased");
                    ky6 ky6Var = ky6.a;
                    hi1Var.a("nanoseconds", ky6.b);
                    return new q9a("kotlinx.datetime.TimeBased", a5b.f, hi1Var.c.size(), b00.D0(o9aVarArr), hi1Var);
                }
                vs.m("Blank serial names are prohibited");
                return null;
            case 8:
                throw new IllegalStateException("Toast not initialized");
            case 9:
                return yae.z(Boolean.FALSE);
            case 10:
                th8 th8Var = yfc.a;
                return Boolean.TRUE;
            case 11:
                yy9 yy9Var = cgc.e;
                return Boolean.TRUE;
            case 12:
                jva jvaVar = rgc.a;
                return pvc.a;
            case 13:
                return yae.z(Boolean.FALSE);
            case 14:
                return new dkc(ekc.a(nae.e, nae.e));
            case 15:
                return yae.z(Boolean.FALSE);
            case 16:
                return yae.z("");
            case 17:
                return yae.z("200");
            case 18:
                return yae.z("2000");
            case 19:
                return yae.z("1");
            case 20:
                return yae.z("detect_auto");
            case 21:
                return yae.z(Boolean.FALSE);
            case 22:
                return yae.z(Boolean.FALSE);
            case 23:
                return new etc();
            case 24:
                r07 r07Var = new r07();
                for (Map.Entry entry : hr9.b.entrySet()) {
                    String lowerCase = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    r07Var.put(lowerCase, (String) entry.getValue());
                }
                for (Map.Entry entry2 : hr9.c.entrySet()) {
                    String str = (String) entry2.getKey();
                    String str2 = (String) entry2.getValue();
                    if (!c16.i(str, "%")) {
                        String lowerCase2 = str.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        r07Var.put(lowerCase2, str2);
                    }
                }
                r07Var.put("m", "mét");
                return r07Var.b();
            case 25:
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(hr9.b.keySet());
                for (String str3 : hr9.c.keySet()) {
                    if (!c16.i(str3, "%")) {
                        arrayList.add(str3);
                    }
                }
                if (arrayList.size() > 1) {
                    wl1.O(new roa(18), arrayList);
                }
                return sl1.i0(arrayList, "|", null, null, new txb(29), 30);
            case 26:
                return new gm9("(?<![\\p{L}\\p{N}_])(\\d+(?:[.,]\\d+)*)?\\s*([a-zμµ²³°]+)/([a-zμµ²³°\\d]+)(?![\\p{L}\\p{N}_])", 0);
            case 27:
                return new gm9(hl5.n("(?<![a-zA-Z\\d.,])(\\d+(?:[.,]\\d+)*)(?:\\s*(tỷ|triệu|nghìn|ngàn))?\\s*(", (String) uvc.b.getValue(), ")(?![\\p{L}\\p{N}_])"), 0);
            case 28:
                return new gm9(hl5.n("(?<![\\d.,])(?<![\\p{L}\\p{N}_])(", sl1.i0(tl1.B("km", "cm", "mm", "kg", "mg", "usd", "vnd", "ph"), "|", null, null, null, 62), ")(?![\\p{L}\\p{N}_])"), 0);
            default:
                return new gm9("([$€¥£₩])\\s*(\\d+(?:[.,]\\d+)*)(?:\\s*(tỷ|triệu|nghìn|ngàn))?", 0);
        }
    }
}
