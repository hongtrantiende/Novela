package defpackage;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nka  reason: default package */
/* loaded from: classes.dex */
public final class nka {
    public Context a;
    public String b;
    public Intent[] c;
    public ComponentName d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public IconCompat h;
    public nu8[] i;
    public Set j;
    public xv6 k;
    public int l;
    public PersistableBundle m;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nka nkaVar = new mka(context, (ShortcutInfo) it.next()).a;
            if (!TextUtils.isEmpty(nkaVar.e)) {
                Intent[] intentArr = nkaVar.c;
                if (intentArr != null && intentArr.length != 0) {
                    arrayList.add(nkaVar);
                } else {
                    vs.m("Shortcut must have an intent");
                    return null;
                }
            } else {
                vs.m("Shortcut must have a non-empty label");
                return null;
            }
        }
        return arrayList;
    }

    public final ShortcutInfo b() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.a, this.b).setShortLabel(this.e).setIntents(this.c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.j(this.a));
        }
        if (!TextUtils.isEmpty(this.f)) {
            intents.setLongLabel(this.f);
        }
        if (!TextUtils.isEmpty(this.g)) {
            intents.setDisabledMessage(this.g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.l);
        PersistableBundle persistableBundle = this.m;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            nu8[] nu8VarArr = this.i;
            if (nu8VarArr != null && nu8VarArr.length > 0) {
                int length = nu8VarArr.length;
                Person[] personArr = new Person[length];
                for (int i = 0; i < length; i++) {
                    nu8 nu8Var = this.i[i];
                    nu8Var.getClass();
                    personArr[i] = ru.P(nu8Var);
                }
                intents.setPersons(personArr);
            }
            xv6 xv6Var = this.k;
            if (xv6Var != null) {
                intents.setLocusId(xv6Var.b);
            }
            intents.setLongLived(false);
        } else {
            if (this.m == null) {
                this.m = new PersistableBundle();
            }
            nu8[] nu8VarArr2 = this.i;
            if (nu8VarArr2 != null && nu8VarArr2.length > 0) {
                this.m.putInt("extraPersonCount", nu8VarArr2.length);
                int i2 = 0;
                while (i2 < this.i.length) {
                    PersistableBundle persistableBundle2 = this.m;
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i3 = i2 + 1;
                    sb.append(i3);
                    String sb2 = sb.toString();
                    nu8 nu8Var2 = this.i[i2];
                    nu8Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    String str2 = nu8Var2.a;
                    if (str2 != null) {
                        str = str2.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", nu8Var2.b);
                    persistableBundle3.putString("key", nu8Var2.c);
                    persistableBundle3.putBoolean("isBot", nu8Var2.d);
                    persistableBundle3.putBoolean("isImportant", nu8Var2.e);
                    persistableBundle2.putPersistableBundle(sb2, persistableBundle3);
                    i2 = i3;
                }
            }
            xv6 xv6Var2 = this.k;
            if (xv6Var2 != null) {
                this.m.putString("extraLocusId", xv6Var2.a);
            }
            this.m.putBoolean("extraLongLived", false);
            intents.setExtras(this.m);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            r4.y(intents);
        }
        return intents.build();
    }
}
