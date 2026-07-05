package defpackage;

import android.content.Context;
import com.google.ads.interactivemedia.v3.impl.data.NetworkResponseData;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import com.google.mlkit.nl.languageid.bundled.internal.ThickLanguageIdentifier;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dne  reason: default package */
/* loaded from: classes.dex */
public final class dne {
    public ThickLanguageIdentifier d;
    public final Context e;
    public final zvd f;
    public final boolean g;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final o40 a = new o40(9, false);

    public dne(Context context, zvd zvdVar) {
        this.e = context;
        this.f = zvdVar;
        zvdVar.getClass();
        this.g = true;
    }

    public final void a() {
        am8.v(Thread.currentThread().equals(((AtomicReference) this.a.d).get()));
        if (this.d == null) {
            this.f.getClass();
            ThickLanguageIdentifier thickLanguageIdentifier = new ThickLanguageIdentifier(this.e);
            this.d = thickLanguageIdentifier;
            thickLanguageIdentifier.b();
        }
    }

    public final ArrayList b(String str, float f) {
        if (this.d == null) {
            a();
        }
        ArrayList arrayList = new ArrayList();
        if (str.isEmpty()) {
            arrayList.add(new IdentifiedLanguage("und", 1.0f));
            return arrayList;
        }
        ThickLanguageIdentifier thickLanguageIdentifier = this.d;
        am8.s(thickLanguageIdentifier);
        ArrayList a = thickLanguageIdentifier.a(str, f);
        int size = a.size();
        int i = 0;
        while (i < size) {
            Object obj = a.get(i);
            i++;
            IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) obj;
            String str2 = identifiedLanguage.a;
            if (!NetworkResponseData.UNKNOWN_CONTENT_TYPE.equals(str2)) {
                if ("iw".equals(str2)) {
                    str2 = "he";
                }
                arrayList.add(new IdentifiedLanguage(str2, identifiedLanguage.b));
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new IdentifiedLanguage("und", 1.0f));
        }
        return arrayList;
    }
}
