package defpackage;

import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pa5  reason: default package */
/* loaded from: classes3.dex */
public final class pa5 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ pa5(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Integer.valueOf(((oa5) obj).a).compareTo(Integer.valueOf(((oa5) obj2).a));
            case 1:
                return Integer.valueOf(((oa5) obj).a).compareTo(Integer.valueOf(((oa5) obj2).a));
            case 2:
                return Integer.valueOf(((oa5) obj).a).compareTo(Integer.valueOf(((oa5) obj2).a));
            case 3:
                return Integer.valueOf(((lb5) obj).a).compareTo(Integer.valueOf(((lb5) obj2).a));
            case 4:
                return Double.valueOf(((j45) obj2).c).compareTo(Double.valueOf(((j45) obj).c));
            case 5:
                Charset charset = (Charset) obj;
                charset.getClass();
                String name = charset.name();
                name.getClass();
                Charset charset2 = (Charset) obj2;
                charset2.getClass();
                String name2 = charset2.name();
                name2.getClass();
                return name.compareTo(name2);
            case 6:
                return hxe.j((Float) ((yk8) obj2).b, (Float) ((yk8) obj).b);
            case 7:
                return Integer.valueOf(((cu5) obj).a).compareTo(Integer.valueOf(((cu5) obj2).a));
            case 8:
                return Integer.valueOf(((cu5) obj).a).compareTo(Integer.valueOf(((cu5) obj2).a));
            case 9:
                return Integer.valueOf(((zi5) obj2).a).compareTo(Integer.valueOf(((zi5) obj).a));
            case 10:
                return Integer.valueOf(((tp6) obj).a).compareTo(Integer.valueOf(((tp6) obj2).a));
            case 11:
                return hxe.j((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
            case 12:
                return hxe.j((String) ((yk8) obj).a, (String) ((yk8) obj2).a);
            case 13:
                return Integer.valueOf(((String) obj2).length()).compareTo(Integer.valueOf(((String) obj).length()));
            case 14:
                return Integer.valueOf(((sl5) obj).g).compareTo(Integer.valueOf(((sl5) obj2).g));
            case 15:
                return Long.valueOf(((j48) obj2).e).compareTo(Long.valueOf(((j48) obj).e));
            case 16:
                return hxe.j((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
            case 17:
                return Integer.valueOf(((mm8) obj2).a).compareTo(Integer.valueOf(((mm8) obj).a));
            case 18:
                return Long.valueOf(((j62) obj2).k).compareTo(Long.valueOf(((j62) obj).k));
            case 19:
                return hxe.j(((ac9) obj).a, ((ac9) obj2).a);
            case 20:
                return hxe.j(((ac9) obj).a, ((ac9) obj2).a);
            case 21:
                return hxe.j(((af9) obj).c, ((af9) obj2).c);
            case 22:
                ((sa6) obj2).getClass();
                Integer num = 1;
                ((sa6) obj).getClass();
                return num.compareTo(num);
            case 23:
                ((hy4) obj2).getClass();
                Integer num2 = 0;
                ((hy4) obj).getClass();
                return num2.compareTo(num2);
            case 24:
                return Long.valueOf(((ip9) obj2).h).compareTo(Long.valueOf(((ip9) obj).h));
            case 25:
                return Integer.valueOf(((v13) obj).a).compareTo(Integer.valueOf(((v13) obj2).a));
            case 26:
                return Integer.valueOf(((v13) obj2).a).compareTo(Integer.valueOf(((v13) obj).a));
            case 27:
                return hxe.j((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 28:
                return hxe.j((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            default:
                return Float.valueOf(((nfa) obj2).b).compareTo(Float.valueOf(((nfa) obj).b));
        }
    }
}
