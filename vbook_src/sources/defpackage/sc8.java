package defpackage;

import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sc8  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class sc8 implements vt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ sc8(int i) {
        this.a = i;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new sz(c4b.a, 0);
            case 1:
                return new sz(c4b.a, 0);
            case 2:
                return new sz(c4b.a, 0);
            case 3:
                return new sz(c4b.a, 0);
            case 4:
                return new sz(c4b.a, 0);
            case 5:
                return new sz(c4b.a, 0);
            case 6:
                return new sz(c4b.a, 0);
            case 7:
                return new sz(c4b.a, 0);
            case 8:
                return cf8.b;
            case 9:
                return new pg8();
            case 10:
                return new zh8(0L, 7);
            case 11:
                ly1 ly1Var = ki8.a;
                return Boolean.FALSE;
            case 12:
                ly1 ly1Var2 = ki8.a;
                return null;
            case 13:
                return new dm8(1.0f);
            case 14:
                return yae.z(Boolean.FALSE);
            case 15:
                return yae.z(Boolean.FALSE);
            case 16:
                return yae.z(Boolean.FALSE);
            case 17:
                return yae.z(Boolean.FALSE);
            case 18:
                return yae.z(Boolean.FALSE);
            case 19:
                return yae.z(Boolean.FALSE);
            case 20:
                return yae.z(Boolean.FALSE);
            case 21:
                return yae.z(Boolean.FALSE);
            case 22:
                int i = ct8.c;
                return pvc.a;
            case 23:
                return Boolean.TRUE;
            case 24:
                return ae2.b;
            case 25:
                ww8 ww8Var = ww8.b;
                Map map = (Map) ww8.c.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap(p17.k(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    String upperCase = ((String) entry.getKey()).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    linkedHashMap.put(upperCase, entry.getValue());
                }
                return linkedHashMap;
            case 26:
                sw2 sw2Var = ab3.a;
                return ru2.c;
            case 27:
                int i2 = b39.a;
                return Boolean.FALSE;
            case 28:
                return yae.z(Boolean.FALSE);
            default:
                return new m78("com.reader.app.ui.screen.community.PublicConversationListRoute", t99.INSTANCE, new Annotation[0]);
        }
    }
}
