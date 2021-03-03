package esprit.pidev.services;

import java.util.Date;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import esprit.pidev.entities.Command;
import esprit.pidev.repositories.CommandLineRepository;
import esprit.pidev.repositories.CommandRepository;

@Service
public class CommandService {

	@Autowired
	CommandRepository cmdrepos;
	CommandLineRepository cmdlinerepos;
	private Logger l = Logger.getLogger(CommandService.class);

	/*
	 * public void affecterCommandLineToCommand(Command command, Integer id) {
	 * cmdrepos.save(command);
	 * 
	 * // int idPanier = commandLine.getCommandeLineId().getIdPanier();
	 * l.info(idPanier); CommandLine UserManageEntity =
	 * cmdlinerepos.findById(idTopic).orElse(null);
	 * 
	 * Command TopicmanagerEntity = cmdrepos.findById(id).orElse(null);
	 * 
	 * TopicmanagerEntity.setCmdline(UserManageEntity);
	 * 
	 * cmdrepos.save(TopicmanagerEntity); }
	 */
	public List<Command> getAllCommand() {

		return (List<Command>) cmdrepos.findAll();
	}

	public Command updateCommandById(int cmdid, Date dateComm) {

		Command commande = cmdrepos.findById(cmdid).get();
		commande.setDateComm(dateComm);
		return cmdrepos.save(commande);

	}

	public void deleteCommandById(int cmdid) {

		Command commande = cmdrepos.findById(cmdid).get();

		cmdrepos.delete(commande);

	}

}
