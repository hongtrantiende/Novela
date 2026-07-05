package com.highcapable.kavaref.extension;

import com.highcapable.kavaref.extension.TypeRef;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class TypeRef<T> {
    private final ye6 type$delegate = new mfb(new vt4(this) { // from class: msc
        public final /* synthetic */ TypeRef b;

        {
            this.b = this;
        }

        @Override // defpackage.vt4
        public final Object invoke() {
            Type type_delegate$lambda$0;
            Class rawType_delegate$lambda$0;
            int i = r2;
            TypeRef typeRef = this.b;
            switch (i) {
                case 0:
                    type_delegate$lambda$0 = TypeRef.type_delegate$lambda$0(typeRef);
                    return type_delegate$lambda$0;
                default:
                    rawType_delegate$lambda$0 = TypeRef.rawType_delegate$lambda$0(typeRef);
                    return rawType_delegate$lambda$0;
            }
        }
    });
    private final ye6 rawType$delegate = new mfb(new vt4(this) { // from class: msc
        public final /* synthetic */ TypeRef b;

        {
            this.b = this;
        }

        @Override // defpackage.vt4
        public final Object invoke() {
            Type type_delegate$lambda$0;
            Class rawType_delegate$lambda$0;
            int i = r2;
            TypeRef typeRef = this.b;
            switch (i) {
                case 0:
                    type_delegate$lambda$0 = TypeRef.type_delegate$lambda$0(typeRef);
                    return type_delegate$lambda$0;
                default:
                    rawType_delegate$lambda$0 = TypeRef.rawType_delegate$lambda$0(typeRef);
                    return rawType_delegate$lambda$0;
            }
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class rawType_delegate$lambda$0(TypeRef typeRef) {
        Type type = typeRef.getType();
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                type = ((ParameterizedType) type).getRawType();
            } else {
                throw new ClassCastException("Cannot cast type " + type + " to java.lang.Class object.");
            }
        }
        return (Class) type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type type_delegate$lambda$0(TypeRef typeRef) {
        Type genericSuperclass = typeRef.getClass().getGenericSuperclass();
        Class<TypeRef> cls = TypeRef.class;
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            Type rawType = parameterizedType.getRawType();
            Class<TypeRef> D = nmd.D(cm9.a(cls));
            if (D != null) {
                cls = D;
            }
            if (c16.i(rawType, cls)) {
                Type type = (Type) b00.n0(parameterizedType.getActualTypeArguments());
                if (type != null) {
                    return type;
                }
                vs.k("Type argument cannot be null.");
                return null;
            }
            vs.k("Must only create direct subclasses of TypeRef.");
            return null;
        }
        Class<TypeRef> D2 = nmd.D(cm9.a(cls));
        if (D2 != null) {
            cls = D2;
        }
        if (c16.i(genericSuperclass, cls)) {
            vs.k("TypeRef must be created with a type argument: object : TypeRef<...>() {}.");
            return null;
        }
        vs.k("Must only create direct subclasses of TypeRef.");
        return null;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof TypeRef) && c16.i(getType(), ((TypeRef) obj).getType())) {
            return true;
        }
        return false;
    }

    public final Class<T> getRawType() {
        return (Class) this.rawType$delegate.getValue();
    }

    public final Type getType() {
        return (Type) this.type$delegate.getValue();
    }

    public int hashCode() {
        return getType().hashCode();
    }

    public String toString() {
        return getType().toString();
    }
}
