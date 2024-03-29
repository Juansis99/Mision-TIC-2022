import Usuario from "../models/Usuario.js";
import emailRegistro from "../helper/emailRegistro.js";

const registrar = async (req, res) => {

    const { nombre, apellido, email, password, telefono, direccion } = req.body; //req.body para  los formuylarios y re.params para la url

    // Validar usuario duplicado
    // findOne busca por los diferentes atributos de la coleccion
    const existeUsuario = await Usuario.findOne({ email });

    if(existeUsuario){
        const error = new Error("Usuario ya registrado");
        return res.status(400).json({msg: error.message});
    };

    try {

        const usuario = new Usuario(req.body);
        const usuarioGuardado = await usuario.save(); //aca se guarda en la base de datos

        // Enviar el email
        emailRegistro({
            email,
            nombre,
            apellido, 
            token: usuarioGuardado.token
        });

        res.json(usuarioGuardado);

    } catch (error) {
        console.error(error.message);
    };

};

const confirmar = async (req, res) => {

    // req.params para leer datos de la URL, en este caso token por que asi lo definimos en la ruta

    const { token } = req.params;
    // console.log(req.params);

    const usuarioConfirmar = await Usuario.findOne({ token });

    // console.log(usuarioConfirmar);
    // console.log(token);
    if (!usuarioConfirmar) {
        const error = new Error("Token no valido");
        // console.log("Token no valido");
        return res.status(404).json({ msg: error.message });
    };

    try {

        usuarioConfirmar.token = null;
        usuarioConfirmar.confirmado = true;

        await usuarioConfirmar.save();

        res.json({
            msg: "Usuario confirmado correctamente",
        });

        // console.log("Usuario confirmado correctamente");
    } catch (error) {
        console.error(error.message);
    };
};

export {
    registrar,
    confirmar
};