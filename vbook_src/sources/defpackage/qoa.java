package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qoa  reason: default package */
/* loaded from: classes3.dex */
public final class qoa {
    public final ioa a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public qoa(ioa ioaVar) {
        ioaVar.getClass();
        this.a = ioaVar;
        String str = ioaVar.b;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        this.b = lowerCase;
        String lowerCase2 = ioaVar.c.toLowerCase(locale);
        lowerCase2.getClass();
        this.c = lowerCase2;
        List<String> list = ioaVar.d;
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        for (String str2 : list) {
            String lowerCase3 = str2.toLowerCase(Locale.ROOT);
            lowerCase3.getClass();
            arrayList.add(lowerCase3);
        }
        this.d = arrayList;
    }
}
