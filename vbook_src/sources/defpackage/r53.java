package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r53  reason: default package */
/* loaded from: classes.dex */
public abstract class r53 {
    public static final String a = r95.r("DiagnosticsWrkr");

    public static final String a(qmd qmdVar, dnd dndVar, igb igbVar, List list) {
        Integer num;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ymd ymdVar = (ymd) it.next();
            hmd s = dxe.s(ymdVar);
            String str = ymdVar.a;
            igbVar.getClass();
            String str2 = s.a;
            int i = s.b;
            str2.getClass();
            hgb hgbVar = (hgb) gae.l(igbVar.a, true, false, new bl(str2, i, 4));
            if (hgbVar != null) {
                num = Integer.valueOf(hgbVar.c);
            } else {
                num = null;
            }
            qmdVar.getClass();
            str.getClass();
            String i0 = sl1.i0((List) gae.l(qmdVar.a, true, false, new a23(str, 19)), ",", null, null, null, 62);
            dndVar.getClass();
            String i02 = sl1.i0((List) gae.l(dndVar.a, true, false, new and(str, 1)), ",", null, null, null, 62);
            StringBuilder o = a82.o("\n", str, "\t ");
            o.append(ymdVar.c);
            o.append("\t ");
            o.append(num);
            o.append("\t ");
            o.append(ymdVar.b.name());
            o.append("\t ");
            o.append(i0);
            o.append("\t ");
            o.append(i02);
            o.append('\t');
            sb.append(o.toString());
        }
        return sb.toString();
    }
}
