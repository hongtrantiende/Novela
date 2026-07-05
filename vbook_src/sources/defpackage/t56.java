package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t56  reason: default package */
/* loaded from: classes.dex */
public final class t56 implements f78, y3d {
    public final boolean a = true;
    public final JsonWriter b;
    public final Map c;
    public final Map d;
    public final e78 e;
    public final boolean f;

    public t56(Writer writer, Map map, Map map2, e78 e78Var, boolean z) {
        this.b = new JsonWriter(writer);
        this.c = map;
        this.d = map2;
        this.e = e78Var;
        this.f = z;
    }

    @Override // defpackage.f78
    public final f78 a(ac4 ac4Var, Object obj) {
        i(obj, ac4Var.a);
        return this;
    }

    @Override // defpackage.y3d
    public final y3d b(String str) {
        j();
        this.b.value(str);
        return this;
    }

    @Override // defpackage.y3d
    public final y3d c(boolean z) {
        j();
        this.b.value(z);
        return this;
    }

    @Override // defpackage.f78
    public final f78 d(ac4 ac4Var, boolean z) {
        String str = ac4Var.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z);
        return this;
    }

    @Override // defpackage.f78
    public final f78 e(ac4 ac4Var, int i) {
        String str = ac4Var.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i);
        return this;
    }

    @Override // defpackage.f78
    public final f78 f(ac4 ac4Var, double d) {
        String str = ac4Var.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d);
        return this;
    }

    @Override // defpackage.f78
    public final f78 g(ac4 ac4Var, long j) {
        String str = ac4Var.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j);
        return this;
    }

    public final t56 h(Object obj) {
        JsonWriter jsonWriter = this.b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                j();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            int i = 0;
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    jsonWriter.value(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    long j = jArr[i];
                    j();
                    jsonWriter.value(j);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    jsonWriter.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    jsonWriter.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i < length5) {
                    h(numberArr[i]);
                    i++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i < length6) {
                    h(objArr[i]);
                    i++;
                }
            }
            jsonWriter.endArray();
            return this;
        } else if (obj instanceof Collection) {
            jsonWriter.beginArray();
            for (Object obj2 : (Collection) obj) {
                h(obj2);
            }
            jsonWriter.endArray();
            return this;
        } else if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    i(entry.getValue(), (String) key);
                } catch (ClassCastException e) {
                    throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            jsonWriter.endObject();
            return this;
        } else {
            e78 e78Var = (e78) this.c.get(obj.getClass());
            if (e78Var != null) {
                jsonWriter.beginObject();
                e78Var.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            x3d x3dVar = (x3d) this.d.get(obj.getClass());
            if (x3dVar != null) {
                x3dVar.a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                if (obj instanceof a78) {
                    int a = ((a78) obj).a();
                    j();
                    jsonWriter.value(a);
                    return this;
                }
                String name = ((Enum) obj).name();
                j();
                jsonWriter.value(name);
                return this;
            } else {
                jsonWriter.beginObject();
                this.e.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
        }
    }

    public final t56 i(Object obj, String str) {
        boolean z = this.f;
        JsonWriter jsonWriter = this.b;
        if (z) {
            if (obj == null) {
                return this;
            }
            j();
            jsonWriter.name(str);
            h(obj);
            return this;
        }
        j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        h(obj);
        return this;
    }

    public final void j() {
        if (this.a) {
            return;
        }
        vs.k("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
